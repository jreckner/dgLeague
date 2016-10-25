package com.recknerd.discgolf.configuration

import com.recknerd.discgolf.domain.entity.PlayerEntity
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration

@Configuration
class DataRestConfiguration extends RepositoryRestMvcConfiguration {

    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        super.configureRepositoryRestConfiguration(config)
        config.setReturnBodyOnCreate(true)
        config.setReturnBodyOnUpdate(true)
        config.exposeIdsFor(PlayerEntity)
        config.metadataConfiguration().setAlpsEnabled(false)
    }
}

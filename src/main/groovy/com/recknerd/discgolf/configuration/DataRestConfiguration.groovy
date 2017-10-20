package com.recknerd.discgolf.configuration

import com.recknerd.discgolf.domain.entity.AceEntity
import com.recknerd.discgolf.domain.entity.CourseEntity
import com.recknerd.discgolf.domain.entity.CtpEntity
import com.recknerd.discgolf.domain.entity.HoleEntity
import com.recknerd.discgolf.domain.entity.LeagueEntity
import com.recknerd.discgolf.domain.entity.PlayerEntity
import com.recknerd.discgolf.domain.entity.RoundEntity
import com.recknerd.discgolf.domain.entity.ScheduleEntity
import com.recknerd.discgolf.domain.entity.ScoreEntity
import com.recknerd.discgolf.domain.entity.TeamEntity
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter

@Configuration
class DataRestConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        super.configureRepositoryRestConfiguration(config)
        config.setReturnBodyOnCreate(true)
        config.setReturnBodyOnUpdate(true)
        config.exposeIdsFor(
                AceEntity,
                CourseEntity,
                CtpEntity,
                HoleEntity,
                LeagueEntity,
                PlayerEntity,
                RoundEntity,
                ScheduleEntity,
                ScoreEntity,
                TeamEntity
        )
    }
}

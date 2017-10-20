package com.recknerd.discgolf.repository

import com.recknerd.discgolf.domain.PlayerInlineTeamsProjection
import com.recknerd.discgolf.domain.entity.PlayerEntity
import com.recknerd.discgolf.domain.web.HypermediaPlayer
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = 'players', path = 'players', excerptProjection = PlayerInlineTeamsProjection)
interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {

    HypermediaPlayer findByEmail(@Param('email') String email)

}

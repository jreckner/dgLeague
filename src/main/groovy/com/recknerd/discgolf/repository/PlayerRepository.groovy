package com.recknerd.discgolf.repository

import com.recknerd.discgolf.domain.entity.PlayerEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = 'players', path = 'players')
interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {

    PlayerEntity findByEmail(@Param('email') String email)

}

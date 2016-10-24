package com.wireblend.yttp.discgolf.repository

import com.wireblend.yttp.discgolf.domain.entity.PlayerEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = 'players', path = 'players')
interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {

    PlayerEntity findByEmail(@Param('email') String email)

}

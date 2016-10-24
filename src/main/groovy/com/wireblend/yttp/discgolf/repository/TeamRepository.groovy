package com.wireblend.yttp.discgolf.repository

import com.wireblend.yttp.discgolf.domain.entity.TeamEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'teams', path = 'teams')
interface TeamRepository extends CrudRepository<TeamEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    TeamEntity findById(@Param('id') Long id)
}

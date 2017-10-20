package com.recknerd.discgolf.repository

import com.recknerd.discgolf.domain.entity.TeamEntity
import com.recknerd.discgolf.domain.web.HypermediaTeam
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'teams', path = 'teams')
interface TeamRepository extends CrudRepository<TeamEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    HypermediaTeam findById(@Param('id') Long id)
}

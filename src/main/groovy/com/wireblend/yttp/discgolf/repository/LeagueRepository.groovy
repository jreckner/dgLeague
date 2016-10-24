package com.wireblend.yttp.discgolf.repository

import com.wireblend.yttp.discgolf.domain.entity.LeagueEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'leagues', path = 'leagues')
interface LeagueRepository extends CrudRepository<LeagueEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    LeagueEntity findById(@Param('id') Long id)
}

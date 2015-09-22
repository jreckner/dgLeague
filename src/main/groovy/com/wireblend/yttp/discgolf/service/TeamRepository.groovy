package com.wireblend.yttp.discgolf.service

import com.wireblend.yttp.discgolf.domain.TeamEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'teams', path = 'teams')
interface TeamRepository extends PagingAndSortingRepository<TeamEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    List<TeamEntity> findById(@Param('id') Long id, Pageable pageable)
}

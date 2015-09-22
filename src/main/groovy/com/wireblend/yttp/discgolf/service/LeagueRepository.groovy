package com.wireblend.yttp.discgolf.service

import com.wireblend.yttp.discgolf.domain.LeagueEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'leagues', path = 'leagues')
interface LeagueRepository extends PagingAndSortingRepository<LeagueEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    List<LeagueEntity> findById(@Param('id') Long id, Pageable pageable)
}

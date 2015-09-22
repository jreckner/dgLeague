package com.wireblend.yttp.discgolf.service

import com.wireblend.yttp.discgolf.domain.PlayerEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'players', path = 'players')
interface PlayerRepository extends PagingAndSortingRepository<PlayerEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    List<PlayerEntity> findById(@Param('id') Long id, Pageable pageable)

    @RestResource(rel = 'findByName', path = 'findByName')
    Page<PlayerEntity> findByName(@Param('name') String name, Pageable pageable)

    @RestResource(rel = 'findByEmail', path = 'findByEmail')
    Page<PlayerEntity> findByEmail(@Param('name') String name, Pageable pageable)
}

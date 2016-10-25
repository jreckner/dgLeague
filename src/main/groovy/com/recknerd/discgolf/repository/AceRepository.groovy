package com.recknerd.discgolf.repository

import com.recknerd.discgolf.domain.entity.AceEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'aces', path = 'aces')
interface AceRepository extends CrudRepository<AceEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    AceEntity findById(@Param('id') Long id)
}

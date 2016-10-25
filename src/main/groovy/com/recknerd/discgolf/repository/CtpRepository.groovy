package com.recknerd.discgolf.repository

import com.recknerd.discgolf.domain.entity.CtpEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'ctps', path = 'ctps')
interface CtpRepository extends CrudRepository<CtpEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    CtpEntity findById(@Param('id') Long id)
}

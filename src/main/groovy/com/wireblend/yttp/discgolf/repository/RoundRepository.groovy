package com.wireblend.yttp.discgolf.repository

import com.wireblend.yttp.discgolf.domain.entity.RoundEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'rounds', path = 'rounds')
interface RoundRepository extends CrudRepository<RoundEntity, Long> {

    @RestResource(rel = 'findById', path = 'findById')
    RoundEntity findById(@Param('id') Long id)

}

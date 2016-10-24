package com.wireblend.yttp.discgolf.repository

import com.wireblend.yttp.discgolf.domain.entity.ScoreEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = 'scores', path = 'scores')
interface ScoreRepository extends CrudRepository<ScoreEntity,Long> {

}

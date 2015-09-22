package com.wireblend.yttp.discgolf.service

import com.wireblend.yttp.discgolf.domain.ScoreEntity
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = 'scores', path = 'scores')
interface ScoreRepository extends PagingAndSortingRepository<ScoreEntity,Long> {

}

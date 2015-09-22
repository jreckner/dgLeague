package com.wireblend.yttp.discgolf.service

import com.wireblend.yttp.discgolf.domain.RoundEntity
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = 'rounds', path = 'rounds')
interface RoundRepository extends PagingAndSortingRepository<RoundEntity,Long> {

}

package com.wireblend.yttp.discgolf.service

import com.wireblend.yttp.discgolf.domain.CourseEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

@RepositoryRestResource(collectionResourceRel = 'courses', path = 'courses')
interface CourseRepository extends PagingAndSortingRepository<CourseEntity,Long> {

    @RestResource(rel = 'findById', path = 'findById')
    List<CourseEntity> findById(@Param('id') Long id, Pageable pageable)
}

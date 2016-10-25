package com.recknerd.discgolf.domain.web

import com.recknerd.discgolf.domain.entity.CourseEntity

import javax.validation.constraints.NotNull

class HypermediaCourse {

    Long id

    String name

    Set<HypermediaLeague> leagues = []

    static HypermediaCourse asHypermedia(@NotNull CourseEntity course) {
        HypermediaCourse hypermediaCourse = new HypermediaCourse(
                id: course.id,
                name: course.name
        )
        course.leagues.forEach { league -> hypermediaCourse.leagues.add(HypermediaLeague.asHypermedia(league)) }
        return hypermediaCourse
    }
}

package com.wireblend.yttp.discgolf.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = 'score')
class ScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    /*
    TeamEntity team

    RoundEntity round

    LeagueEntity league

    CourseEntity course
    */
}

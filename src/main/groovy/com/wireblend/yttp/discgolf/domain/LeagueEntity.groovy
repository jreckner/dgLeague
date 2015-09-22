package com.wireblend.yttp.discgolf.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = 'league')
class LeagueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'name', nullable = false)
    String name

    @Column(name = 'season', nullable = false)
    String season

    @Column(name = 'year', nullable = false)
    String year

    @Column(name = 'type', nullable = false)
    String type
}

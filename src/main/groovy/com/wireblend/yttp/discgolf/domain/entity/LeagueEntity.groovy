package com.wireblend.yttp.discgolf.domain.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

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

    @Column(name = 'active', nullable = false)
    Boolean active

    @OneToMany(mappedBy='league', cascade=CascadeType.ALL)
    Set<RoundEntity> rounds

    @ManyToOne
    @JoinColumn(name = 'course_id')
    CourseEntity course
}

package com.wireblend.yttp.discgolf.domain.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity(name = 'course')
class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'name', nullable = false)
    String name

    @OneToMany(mappedBy='course', cascade=CascadeType.ALL)
    Set<LeagueEntity> leagues

    @OneToMany(mappedBy='course', cascade=CascadeType.ALL)
    Set<HoleEntity> holes


}

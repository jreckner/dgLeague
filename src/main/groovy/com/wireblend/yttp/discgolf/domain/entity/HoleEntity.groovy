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

@Entity(name = 'hole')
class HoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'number', nullable = false)
    Integer holeNumber

    @Column(name = 'position', nullable = true)
    String pinPosition

    @Column(name = 'color', nullable = true)
    String color

    @Column(name = 'distance', nullable = false)
    Integer distance

    @Column(name = 'measurement_system', nullable = false)
    String measurementSystem = 'ft'

    @ManyToOne
    @JoinColumn(name = 'course_id')
    CourseEntity course

    @OneToMany(mappedBy='hole', cascade=CascadeType.ALL)
    Set<AceEntity> aces

    @OneToMany(mappedBy='hole', cascade=CascadeType.ALL)
    Set<CtpEntity> ctps
}

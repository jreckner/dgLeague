package com.recknerd.discgolf.domain.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.JoinColumn
import javax.persistence.ManyToMany
import javax.persistence.OneToMany

@Entity(name= 'team')
class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'name', nullable = false)
    String name

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="team_id")
    Set<PlayerEntity> players

    @OneToMany(mappedBy='team', cascade=CascadeType.ALL)
    Set<ScoreEntity> scores
}

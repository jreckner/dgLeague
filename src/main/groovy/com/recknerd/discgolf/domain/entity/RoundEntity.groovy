package com.recknerd.discgolf.domain.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.OneToOne

@Entity(name = 'round')
class RoundEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'name', nullable = false)
    String name

    @Column(name = 'played_on', nullable = false)
    Date playedOn

    @ManyToOne
    @JoinColumn(name = 'league_id')
    LeagueEntity league

    @OneToMany(mappedBy='round', cascade=CascadeType.ALL)
    Set<ScoreEntity> scores

    @OneToOne(mappedBy='round', cascade=CascadeType.ALL)
    CtpEntity ctp
}

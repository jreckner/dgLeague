package com.recknerd.discgolf.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity(name = 'ace')
class AceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'achieved_on', nullable = false)
    Date achievedOn

    @ManyToOne
    @JoinColumn(name = 'player_id')
    PlayerEntity player

    @ManyToOne
    @JoinColumn(name = 'hole_id')
    HoleEntity hole
}

package com.recknerd.discgolf.domain.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.persistence.UniqueConstraint

@Entity(name = 'ctp')
@Table(uniqueConstraints = [
        @UniqueConstraint(columnNames = ['player_id', 'round_id'])
])
class CtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @ManyToOne
    @JoinColumn(name = 'player_id')
    PlayerEntity player

    @OneToOne
    @JoinColumn(name = 'round_id')
    RoundEntity round

    @ManyToOne
    @JoinColumn(name = 'hole_id')
    HoleEntity hole
}

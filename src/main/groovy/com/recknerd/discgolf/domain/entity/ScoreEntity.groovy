package com.recknerd.discgolf.domain.entity

import static javax.persistence.GenerationType.IDENTITY

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.persistence.UniqueConstraint

@Entity(name = 'score')
@Table(uniqueConstraints = [
        @UniqueConstraint(columnNames = ['player_id', 'round_id'])
])
class ScoreEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id

    @Column(name = 'score', nullable = false)
    Integer score

    @ManyToOne
    @JoinColumn(name = 'player_id')
    PlayerEntity player

    @ManyToOne
    @JoinColumn(name = 'round_id')
    RoundEntity round
}

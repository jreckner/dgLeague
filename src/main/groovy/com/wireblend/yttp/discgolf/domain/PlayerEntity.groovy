package com.wireblend.yttp.discgolf.domain

import javax.persistence.Column
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity(name= 'player')
class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'name', nullable = false)
    String name

    @Column(name = 'email', nullable = false)
    String email

    @ManyToOne
    @JoinColumn(name = 'team_id')
    TeamEntity team
}

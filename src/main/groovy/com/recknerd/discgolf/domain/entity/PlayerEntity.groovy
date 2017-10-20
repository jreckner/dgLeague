package com.recknerd.discgolf.domain.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.ManyToMany
import javax.persistence.OneToMany

@Entity(name= 'player')
class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(name = 'name', nullable = false)
    String name

    @Column(unique = true, name = 'email', nullable = false)
    String email

    @ManyToMany(mappedBy="players", cascade=CascadeType.ALL)
    Set<TeamEntity> teams

    @OneToMany(mappedBy='player', cascade=CascadeType.ALL)
    Set<AceEntity> aces

    @OneToMany(mappedBy='player', cascade=CascadeType.ALL)
    Set<CtpEntity> ctps
}

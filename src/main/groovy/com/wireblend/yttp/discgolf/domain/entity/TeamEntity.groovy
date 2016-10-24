package com.wireblend.yttp.discgolf.domain.entity

import javax.persistence.CascadeType
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.OneToMany

@Entity(name= 'team')
class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @OneToMany(mappedBy='team', cascade=CascadeType.ALL)
    Set<PlayerEntity> players

}

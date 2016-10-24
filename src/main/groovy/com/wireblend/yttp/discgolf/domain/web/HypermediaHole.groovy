package com.wireblend.yttp.discgolf.domain.web

import com.wireblend.yttp.discgolf.domain.entity.HoleEntity

class HypermediaHole {

    static final String DEFAULT = 'default'

    Long id

    Integer holeNumber

    String pinPosition

    String color

    Integer distance

    String measurementSystem

    static HypermediaHole asHypermedia(HoleEntity hole) {
        return new HypermediaHole(
                id: hole.id,
                holeNumber: hole.holeNumber,
                pinPosition: hole.pinPosition ?: DEFAULT,
                color: hole.color ?: DEFAULT,
                distance: hole.distance
        )
    }
}

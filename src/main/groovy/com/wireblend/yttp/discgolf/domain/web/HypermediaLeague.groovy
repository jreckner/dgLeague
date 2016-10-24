package com.wireblend.yttp.discgolf.domain.web

import com.wireblend.yttp.discgolf.domain.entity.LeagueEntity

import javax.validation.constraints.NotNull

class HypermediaLeague {

    Long id

    String name

    String season

    String year

    String type

    Boolean active

    Set<HypermediaRound> rounds = []

    static HypermediaLeague asHypermedia(@NotNull LeagueEntity league) {
        HypermediaLeague hypermediaLeague =  new HypermediaLeague(
                id: league.id,
                name: league.name,
                season: league.season,
                year: league.year,
                type: league.type,
                active: league.active
        )
        league.rounds.forEach { round -> hypermediaLeague.rounds.add(HypermediaRound.asHypermedia(round)) }
        return hypermediaLeague
    }
}

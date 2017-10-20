package com.recknerd.discgolf.domain.web

import com.recknerd.discgolf.domain.entity.PlayerEntity
import com.recknerd.discgolf.domain.entity.RoundEntity

import javax.validation.constraints.NotNull

class HypermediaRound {

    Long id

    String leagueName

    String name

    Date playedOn

    String ctp

    Set<HypermediaResult> results = []

    static HypermediaRound asHypermedia(@NotNull RoundEntity round) {
        HypermediaRound hypermediaRound = new HypermediaRound(
                id: round.id,
                leagueName: round.league.name,
                name: round.name,
                playedOn: round.playedOn,
                ctp: round?.ctp?.player?.name ?: ''
        )
        round.scores.forEach { score ->
            hypermediaRound.results.add(
                    new HypermediaResult(
                            teamName: score.team.name,
                            teamNames: score.team.players.name,
                            teamEmails: score.team.players.email,
                            finalScore: score.score,
                            roundId: score.round.id
                    )
            )
        }
        return hypermediaRound
    }

}

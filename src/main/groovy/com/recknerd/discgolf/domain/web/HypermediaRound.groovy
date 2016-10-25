package com.recknerd.discgolf.domain.web

import com.recknerd.discgolf.domain.entity.RoundEntity

import javax.validation.constraints.NotNull

class HypermediaRound {

    Long id

    String name

    Date playedOn

    String ctp

    Set<HypermediaResult> results = []

    static HypermediaRound asHypermedia(@NotNull RoundEntity round) {
        HypermediaRound hypermediaRound = new HypermediaRound(
                id: round.id,
                name: round.name,
                playedOn: round.playedOn,
                ctp: round?.ctp?.player?.name ?: ''
        )
        round.scores.forEach { score ->
            hypermediaRound.results.add(
                    new HypermediaResult(
                            playerName: score.player.name,
                            playerEmail: score.player.email,
                            finalScore: score.score,
                            roundId: score.round.id
                    )
            )
        }
        return hypermediaRound
    }
}

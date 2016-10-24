package com.wireblend.yttp.discgolf.web

import static org.springframework.web.bind.annotation.RequestMethod.POST

import com.wireblend.yttp.discgolf.domain.entity.ScoreEntity
import com.wireblend.yttp.discgolf.domain.web.HypermediaResult
import com.wireblend.yttp.discgolf.repository.PlayerRepository
import com.wireblend.yttp.discgolf.repository.RoundRepository
import com.wireblend.yttp.discgolf.repository.ScoreRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Slf4j
@Controller
@RequestMapping('/api/result')
class ResultController {

    @Autowired
    ScoreRepository scoreRepository

    @Autowired
    PlayerRepository playerRepository

    @Autowired
    RoundRepository roundRepository

    @RequestMapping(value = '/', method= POST)
    @ResponseBody HypermediaResult postRoundResult(@RequestBody HypermediaResult result) {
        ScoreEntity score = new ScoreEntity(
                score: result.finalScore,
                player: playerRepository.findByEmail(result.playerEmail),
                round: roundRepository.findById(result.roundId)
        )
        scoreRepository.save(score)
        return result
    }
}

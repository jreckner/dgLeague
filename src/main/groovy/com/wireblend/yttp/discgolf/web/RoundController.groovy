package com.wireblend.yttp.discgolf.web

import static org.springframework.web.bind.annotation.RequestMethod.GET

import com.wireblend.yttp.discgolf.domain.web.HypermediaRound
import com.wireblend.yttp.discgolf.repository.RoundRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Slf4j
@Controller
@RequestMapping('/api/round')
class RoundController {

    @Autowired
    RoundRepository roundRepository

    @RequestMapping(value = '', method = GET)
    @ResponseBody
    List<HypermediaRound> allRounds() {
        List<HypermediaRound> rounds = []
        roundRepository.findAll().forEach { round -> rounds.add(HypermediaRound.asHypermedia(round)) }
        return rounds
    }

    @RequestMapping(value = '{id}', method = GET)
    @ResponseBody
    HypermediaRound round(@PathVariable('id') Long id) {
        return HypermediaRound.asHypermedia(roundRepository.findById(id))
    }
}

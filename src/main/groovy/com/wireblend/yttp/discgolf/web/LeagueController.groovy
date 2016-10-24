package com.wireblend.yttp.discgolf.web

import static org.springframework.web.bind.annotation.RequestMethod.GET
import static org.springframework.web.bind.annotation.RequestMethod.PUT

import com.wireblend.yttp.discgolf.domain.entity.LeagueEntity
import com.wireblend.yttp.discgolf.domain.web.HypermediaLeague
import com.wireblend.yttp.discgolf.repository.LeagueRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Slf4j
@Controller
@RequestMapping('/api/league')
class LeagueController {

    static final String SINGLES = 'singles'
    static final String DOUBLES = 'doubles'

    @Autowired
    LeagueRepository leagueRepository

    @RequestMapping(value = '', method= GET)
    @ResponseBody List<HypermediaLeague> allLeagues() {
        List<HypermediaLeague> leagues = []
        leagueRepository.findAll().forEach { league -> leagues.add(HypermediaLeague.asHypermedia(league)) }
        return leagues
    }

    @RequestMapping(value = '/{id}', method= GET)
    @ResponseBody HypermediaLeague league(@PathVariable('id') Long id) {
        return HypermediaLeague.asHypermedia(leagueRepository.findById(id))
    }

    @RequestMapping(value = '/{id}/active', method= PUT)
    @ResponseBody HypermediaLeague setLeagueActive(@PathVariable('id') Long id) {
        LeagueEntity league = leagueRepository.findById(id)
        league.active = true
        leagueRepository.save(league)
        return HypermediaLeague.asHypermedia(league)
    }

    @RequestMapping(value = '/{id}/inactive', method= PUT)
    @ResponseBody HypermediaLeague setLeagueInactive(@PathVariable('id') Long id) {
        LeagueEntity league = leagueRepository.findById(id)
        league.active = false
        leagueRepository.save(league)
        return HypermediaLeague.asHypermedia(league)
    }

    @RequestMapping(value = '/active', method= GET)
    @ResponseBody List<HypermediaLeague> activeLeagues() {
        List<HypermediaLeague> leagues = []
        leagueRepository.findAll().forEach { league ->
            league.active ? leagues.add(HypermediaLeague.asHypermedia(league)) : null
        }
        return leagues
    }

    @RequestMapping(value = '/active/singles', method= GET)
    @ResponseBody List<HypermediaLeague> activeSinglesLeagues() {
        List<HypermediaLeague> leagues = []
        leagueRepository.findAll().forEach { league ->
            (league.active && league.type.toLowerCase() == SINGLES) ?
                    leagues.add(HypermediaLeague.asHypermedia(league)) : null
        }
        return leagues
    }

    @RequestMapping(value = '/active/doubles', method= GET)
    @ResponseBody List<HypermediaLeague> activeDoublesLeagues() {
        List<HypermediaLeague> leagues = []
        leagueRepository.findAll().forEach { league ->
            (league.active && league.type.toLowerCase() == DOUBLES) ?
                    leagues.add(HypermediaLeague.asHypermedia(league)) : null
        }
        return leagues
    }
}

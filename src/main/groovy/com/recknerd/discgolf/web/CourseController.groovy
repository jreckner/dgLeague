package com.recknerd.discgolf.web

import static org.springframework.web.bind.annotation.RequestMethod.GET

import com.recknerd.discgolf.domain.web.HypermediaCourse
import com.recknerd.discgolf.domain.web.HypermediaHole
import com.recknerd.discgolf.repository.CourseRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Slf4j
@Controller
@RequestMapping('/api/course')
class CourseController {

    static final Integer NINE = 9

    @Autowired
    CourseRepository courseRepository

    @RequestMapping(value = '', method= GET)
    @ResponseBody List<HypermediaCourse> allCourses() {
        List<HypermediaCourse> courses = []
        courseRepository.findAll().forEach { course -> courses.add(HypermediaCourse.asHypermedia(course)) }
        return courses
    }

    @RequestMapping(value = '/{id}', method= GET)
    @ResponseBody HypermediaCourse courseById(@PathVariable('id') Long id, Pageable pageable) {
        log.info 'Find course by id: {}', id
        return HypermediaCourse.asHypermedia(courseRepository.findById(id, pageable).first())
    }

    @RequestMapping(value = '/{id}/front', method= GET)
    @ResponseBody List<HypermediaHole> courseFrontNine(@PathVariable('id') Long id, Pageable pageable) {
        log.info 'Find course by id: {}, front nine', id
        return courseRepository.findById(id, pageable).first().holes.findAll { hole ->
            hole.holeNumber <= NINE ? HypermediaHole.asHypermedia(hole) : null
        }
    }

    @RequestMapping(value = '/{id}/back', method= GET)
    @ResponseBody List<HypermediaHole> courseBackNine(@PathVariable('id') Long id, Pageable pageable) {
        log.info 'Find course by id: {}, back nine', id
        return courseRepository.findById(id, pageable).first().holes.findAll { hole ->
            hole.holeNumber > NINE ? HypermediaHole.asHypermedia(hole) : null
        }
    }

}

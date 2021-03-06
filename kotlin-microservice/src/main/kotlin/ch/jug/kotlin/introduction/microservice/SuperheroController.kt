package ch.jug.kotlin.introduction.microservice

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "/superheroes")
class SuperheroController @Autowired constructor(val superheroRepository: SuperheroRepository) {

    @CrossOrigin
    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun findAll(): List<Superhero> = superheroRepository.findAll()

    @RequestMapping(method = arrayOf(RequestMethod.POST))
    fun addSuperhero(@RequestBody superhero: Superhero): Superhero = superheroRepository.save(superhero)

    @CrossOrigin
    @RequestMapping(method = arrayOf(RequestMethod.POST),consumes = arrayOf(MediaType.MULTIPART_FORM_DATA_VALUE))
    fun addSuperheroFromFrom(@ModelAttribute("superpower") superpower :String, @ModelAttribute("name") name:String):Superhero {
        val persistedHero = superheroRepository.save(Superhero(name, superpower))
        return persistedHero
    }
}
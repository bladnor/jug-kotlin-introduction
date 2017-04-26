package ch.jug.kotlin.introduction.microservice

import org.springframework.data.jpa.repository.JpaRepository

interface SuperheroRepository : JpaRepository<Superhero, Long>

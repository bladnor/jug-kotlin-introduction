package ch.jug.kotlin.introduction.microservice

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class KotlinMicroserviceApplication {

    @Bean
    open fun init(repository: SuperheroRepository) = CommandLineRunner {
        repository.save(Superhero("elektra","combat"))
        repository.save(Superhero("loki","shape-shifting"))
        repository.save(Superhero("superman","flight"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinMicroserviceApplication::class.java, *args)
}
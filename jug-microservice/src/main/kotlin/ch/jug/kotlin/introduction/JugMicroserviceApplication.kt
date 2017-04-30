package ch.jug.kotlin.introduction

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class JugMicroserviceApplication

fun main(args: Array<String>) {
    SpringApplication.run(JugMicroserviceApplication::class.java, *args)
}

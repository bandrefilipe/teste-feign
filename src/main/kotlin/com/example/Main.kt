package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Main {
    init {
        println("com.example.Main initiated")
    }
}

fun main() {
    runApplication<Main>()
}

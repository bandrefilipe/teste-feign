package com.example.feign

import org.springframework.stereotype.Component

@Component
class Executor(client: Client) {
    init {
        println("com.example.feign.Executor initiated")
        client.healthCheck().also { println(it) }
    }
}

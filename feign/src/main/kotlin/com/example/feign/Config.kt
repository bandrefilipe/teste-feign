package com.example.feign

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients(basePackageClasses = [Client::class])
class Config {
    init {
        println("com.example.feign.Config initiated")
    }
}

package com.example.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(url = "http://localhost:8088/health")
interface Client {

    @GetMapping
    fun healthCheck(): ResponseEntity<Any>
}

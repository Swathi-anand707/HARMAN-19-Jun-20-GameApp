package com.harman.avengers.controller

import com.harman.avengers.repo.CharacterRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class CharacterController (private val repository: CharacterRepo){
    @GetMapping("/charecter" )
   fun findAll() = repository.findAll()

    @GetMapping("/{name}")
    fun findByName(@PathVariable name:String)
            = repository.findByName(name)
    @GetMapping("/{name}")
    fun deleteByName(@PathVariable name:String)
            = repository.deleteByName(name)
    }








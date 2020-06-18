package com.harman.avengers.api

import com.harman.avengers.dto.Character
import com.harman.avengers.dto.Place
import org.springframework.web.bind.annotation.GetMapping

interface ApiService {

    @GetMapping("place")
    suspend fun getMutants(): List<Place>
    @GetMapping("Character")
    suspend fun getAvenger(): List<Character>
    @GetMapping("Character")
    suspend fun getAntiHeroes(): List<Character>


}
package com.harman.avengers.local

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service

@Service

class AntiHeroService {
    fun antihero():AntiHero{
        val mapper= ObjectMapper()
        val jsonfile = ClassPathResource("AntiHeroes.json")
        val antiHero = mapper.readValue(jsonfile.inputStream, AntiHero::class.java )
        return antiHero

    }
}


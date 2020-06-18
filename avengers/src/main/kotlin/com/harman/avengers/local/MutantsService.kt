package com.harman.avengers.local

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service


    @Service
    class MutantsService {
        fun mutant(): Mutants{
            val mapper= ObjectMapper()
            val jsonfile = ClassPathResource("Mutants.json")
            val mutants = mapper.readValue(jsonfile.inputStream, Mutants::class.java )
            return mutants

        }
    }

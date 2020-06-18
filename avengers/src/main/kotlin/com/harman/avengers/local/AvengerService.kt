package com.harman.avengers.local

import com.fasterxml.jackson.databind.ObjectMapper
import com.harman.avengers.AvengersApplication
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service

@Service
class AvengerService  {
    fun avenger():Avenger {
        val mapper=ObjectMapper()
        val jsonfile = ClassPathResource("Avengers.json")
        val avengers = mapper.readValue(jsonfile.inputStream, Avenger::class.java )
        return avengers

    }
}
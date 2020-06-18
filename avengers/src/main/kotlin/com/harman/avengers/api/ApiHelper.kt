package com.harman.avengers.api

import com.harman.avengers.dto.Character
import com.harman.avengers.dto.Place

interface ApiHelper {


    suspend fun getMutants(): List<Place>

    suspend fun getAvenger(): List<Character>

    suspend fun getAntiHeroes(): List<Character>




}
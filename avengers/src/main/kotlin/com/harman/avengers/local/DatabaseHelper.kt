package com.harman.avengers.local

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.SQLInsert
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping
import javax.xml.stream.events.Characters

interface DatabaseHelper {

    suspend fun getCharacters(): List<Character>

    suspend fun insertAll(characters: List<Character>)

}
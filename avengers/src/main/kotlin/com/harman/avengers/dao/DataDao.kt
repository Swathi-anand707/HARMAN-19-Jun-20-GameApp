package com.harman.avengers.dao

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.SQLInsert
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping

    @Service
    interface DataDao {

        @Query("SELECT * FROM Character")
        suspend fun getAll(): List<Character>


        suspend fun add(charecters: List<Character>)


        suspend fun delete(character: Character)


    }


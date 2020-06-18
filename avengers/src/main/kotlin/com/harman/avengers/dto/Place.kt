package com.harman.avengers.dto

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Place(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        var name: String,
        val max_power:Int? )
package com.harman.avengers.local

import com.harman.avengers.dto.Character

data class Avenger (var name:String , var character:List<Character>){

    constructor():this("NOT_SET", listOf())
}


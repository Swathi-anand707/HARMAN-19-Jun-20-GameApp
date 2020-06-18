package com.harman.avengers.local

import com.harman.avengers.dto.Character
import com.harman.avengers.dto.Place

data class Mutants (var name:String , var places:List<Place>){

    constructor():this("NOT_SET", listOf())
}
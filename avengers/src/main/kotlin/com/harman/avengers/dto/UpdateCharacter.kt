package com.harman.avengers.dto

import javax.persistence.Entity
import javax.xml.stream.events.Characters
@Entity
data class UpdateCharacter(val id: Int=-0, var characters:String = "", var max_power: Int?)
@Entity
data class CreateUpdateDTO(val id: Int=-0,var name: String,  var max_power: Int?)
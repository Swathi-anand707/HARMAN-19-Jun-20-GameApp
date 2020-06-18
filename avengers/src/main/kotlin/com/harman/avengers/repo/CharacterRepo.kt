package com.harman.avengers.repo

import com.harman.avengers.dto.Character

interface CharacterRepo: CrudRepository<Character, Long> {
    fun findByName(name: String): Iterable<Character>
    fun deleteByName(name: String): Iterable<Character>

}
package com.harman.avengers.repo

import com.harman.avengers.dto.Character
import com.harman.avengers.dto.Place

interface CrudRepository<T, U> {
    fun findAll(): Iterable<T>


}

package com.harman.avengers.dao

interface UpdateDao {
    suspend fun updateCharecter(character: Character)
}
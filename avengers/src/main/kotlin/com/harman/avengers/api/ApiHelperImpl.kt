package com.harman.avengers.api

class ApiHelperImpl(private  val apiService: ApiService): ApiHelper{
    override suspend fun getAvenger()= apiService.getAvenger()


    override suspend fun getAntiHeroes() = apiService.getAntiHeroes()


    override suspend fun getMutants() = apiService.getMutants()



}






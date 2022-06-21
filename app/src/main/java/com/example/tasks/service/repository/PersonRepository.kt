package com.example.tasks.service.repository

import com.example.tasks.service.repository.remote.PersonService
import com.example.tasks.service.repository.remote.RetroFitClient

class PersonRepository {

    val remote = RetroFitClient.createService(PersonService::class.java)

    fun login(email: String, password:String){
        remote.login(email, password)
    }

}
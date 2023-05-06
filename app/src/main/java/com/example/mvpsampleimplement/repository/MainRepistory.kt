package com.example.mvpsampleimplement.repository

import com.example.mvpsampleimplement.model.User
import com.example.mvpsampleimplement.ui.FakeApiServices
import com.example.mvpsampleimplement.ui.FakeDatabase

class MainRepistory {

    private val api = FakeApiServices()
    private val database = FakeDatabase()


    fun getUserInfo() = database.getUserInfo()
    fun getLetters() = api.getRandomLetters()


}
package com.example.mvpsampleimplement.ui

import com.example.mvpsampleimplement.model.User

class FakeDatabase {


    fun getUserInfo(): User {

        return User("Hi , Mohammed Hesham", 1998)

    }


}
package com.example.mvpsampleimplement.ui

import com.example.mvpsampleimplement.model.Letters
import com.example.mvpsampleimplement.model.User

interface IMainInterface {

    fun onUserInfoSuccess(user: User)
    fun onLettersSuccess(letter: Letters)
}
package com.example.mvpsampleimplement.presenter

import com.example.mvpsampleimplement.repository.MainRepistory
import com.example.mvpsampleimplement.ui.IMainInterface

class MainPresenter {

    private val repistory = MainRepistory()
    lateinit var view: IMainInterface


    fun getUserInfo() {
        val result = repistory.getUserInfo()
        view.onUserInfoSuccess(result)
    }

    fun getLetters() {
        val result = repistory.getLetters()
        view.onLettersSuccess(result)

    }


}
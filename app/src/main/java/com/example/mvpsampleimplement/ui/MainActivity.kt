package com.example.mvpsampleimplement.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpsampleimplement.R
import com.example.mvpsampleimplement.databinding.ActivityMainBinding
import com.example.mvpsampleimplement.model.Letters
import com.example.mvpsampleimplement.model.User
import com.example.mvpsampleimplement.presenter.MainPresenter

class MainActivity : AppCompatActivity(), IMainInterface {

    lateinit var binding: ActivityMainBinding
    private val prsenter = MainPresenter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }


    fun setup() {
        prsenter.view = this
        prsenter.getUserInfo()
        binding.btnFetchLetters.setOnClickListener {
            prsenter.getLetters()
        }

    }

    override fun onUserInfoSuccess(user: User) {
        binding.tvUsername.text = user.userName

    }

    override fun onLettersSuccess(letter: Letters) {
        binding.apply {
            tvContent.text = letter.letter
            tvDate.text = letter.date
        }

    }
}
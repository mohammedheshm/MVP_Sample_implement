package com.example.mvpsampleimplement.ui

import com.example.mvpsampleimplement.model.Letters

class FakeApiServices {

    private val listLetter = listOf<Letters>(
        Letters("a", "2023/8/4"),
        Letters("b", "2023/8/4"),
        Letters("c", "2023/8/4"),
        Letters("d", "2023/8/1"),
        Letters("e", "2023/8/9"),
        Letters("f", "2023/8/12"),
        Letters("g", "2023/8/01"),
        Letters("h", "2023/8/30"),
        Letters("i", "2023/8/22"),
        Letters("j", "2023/10/4"),
        Letters("k", "2023/3/4"),
        Letters("l", "2023/4/4"),
        Letters("m", "2023/8/4"),
        Letters("n", "2023/8/4"),
        Letters("o", "2023/5/4"),
        Letters("p", "2023/5/4"),
        Letters("q", "2023/3/4"),
        Letters("r", "2023/2/4"),
        Letters("s", "2023/12/4"),
        Letters("t", "2023/11/4"),
        Letters("v", "2023/10/4"),
    )


    fun getRandomLetters(): Letters {
        val random = (Math.random() * listLetter.size).toInt()
        return listLetter[random]
    }


}
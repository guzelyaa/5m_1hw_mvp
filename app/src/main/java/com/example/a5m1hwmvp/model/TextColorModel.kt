package com.example.a5m1hwmvp.model

import android.graphics.Color

class TextColorModel {

    private val color = Color.rgb(100, 0, 87)
    private val greenColor = Color.rgb(0, 100, 0)

    fun  getColor():Int{
        return color
    }
    fun  getGreenColor():Int{
        return greenColor
    }

}
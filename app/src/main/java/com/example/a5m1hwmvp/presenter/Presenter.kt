package com.example.a5m1hwmvp.presenter

import android.content.Context
import android.widget.Toast
import com.example.a5m1hwmvp.model.CounterModel
import com.example.a5m1hwmvp.model.TextColorModel
import com.example.a5m1hwmvp.view.CounterView

class Presenter {

    private lateinit var context: Context
    val model = CounterModel()
    private lateinit var view:CounterView

    val colorModel = TextColorModel()

    fun setContext(context: Context){
        this.context = context
    }

    fun increment(){
        model.increment()
        view.updateCounter(model.getCounter())
        if (model.getCounter() == 10){
            Toast.makeText(context, "Поздравляем!", Toast.LENGTH_LONG).show()
        }
    }
    fun decrement(){
        model.decrement()
        view.updateCounter(model.getCounter())
    }
    fun attachView(view: CounterView){
        this.view = view
    }

    fun changeColor(){
        view.changeColor(colorModel.getColor())
    }

    fun changeCounterColor(){
        if (model.getCounter() == 15) {
            view.changeCounterColor(colorModel.getGreenColor())
        }
    }
}
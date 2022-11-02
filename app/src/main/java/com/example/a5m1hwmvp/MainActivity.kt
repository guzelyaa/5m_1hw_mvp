package com.example.a5m1hwmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a5m1hwmvp.databinding.ActivityMainBinding
import com.example.a5m1hwmvp.presenter.Presenter
import com.example.a5m1hwmvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.setContext(this)
        presenter.attachView(this)

        onClick()
        textColor()
    }

    private fun onClick(){
        binding.btnIncrement.setOnClickListener {
            presenter.increment()
        }
        binding.btnDecrement.setOnClickListener {
            presenter.decrement()
        }

    }

    override fun updateCounter(model: Int) {
        binding.tvCounter.text = model.toString()
    }

    override fun changeColor(color: Int) {
            binding.tvHello.setTextColor(color)
    }

    private fun textColor(){
        binding.btnChangeColor.setOnClickListener {
            presenter.changeColor()
        }
    }
}
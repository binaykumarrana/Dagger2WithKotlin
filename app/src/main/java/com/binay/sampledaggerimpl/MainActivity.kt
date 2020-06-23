package com.binay.sampledaggerimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binay.sampledaggerimpl.di.DaggerCarComponent
import com.binay.sampledaggerimpl.model.Car

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerCarComponent.create()
        car = component.getCar()
        car.drive()
    }
}
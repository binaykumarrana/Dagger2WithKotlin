package com.binay.sampledaggerimpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binay.sampledaggerimpl.di.DaggerCarComponent
import com.binay.sampledaggerimpl.di.module.PetrolEngineModule
import com.binay.sampledaggerimpl.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component =
            DaggerCarComponent.builder().horsePower(100).engineCapacity(200).build()
        component.inject(this)
        car.drive()
    }
}
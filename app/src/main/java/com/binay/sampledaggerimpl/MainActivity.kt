package com.binay.sampledaggerimpl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binay.sampledaggerimpl.di.module.PetrolEngineModule
import com.binay.sampledaggerimpl.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component =
           (application as MyApp).getCarComponent().getActivityComponent(PetrolEngineModule(100))
        component.inject(this)
        car1.drive()
        car2.drive()
    }
}
package com.binay.sampledaggerimpl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.binay.sampledaggerimpl.di.DaggerActivityComponent
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
            DaggerActivityComponent.builder().appComponent((application as MyApp).getCarComponent())
                .engineCapacity(200).horsePower(100).build()
        component.inject(this)
        car1.drive()
        car2.drive()
    }
}
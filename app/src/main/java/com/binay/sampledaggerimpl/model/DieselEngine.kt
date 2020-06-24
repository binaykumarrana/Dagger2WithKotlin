package com.binay.sampledaggerimpl.model

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d("Car", "Diesel engine started horse power = $horsePower")
    }
}
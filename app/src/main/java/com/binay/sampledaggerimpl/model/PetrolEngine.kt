package com.binay.sampledaggerimpl.model

import android.util.Log

class PetrolEngine constructor(private val horsePower: Int) : Engine {
    override fun start() {
        Log.d("Car", "Petrol engine started horse power=$horsePower")
    }
}
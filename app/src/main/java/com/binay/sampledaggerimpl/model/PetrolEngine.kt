package com.binay.sampledaggerimpl.model

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(private val horsePower: Int) : Engine {
    override fun start() {
        Log.d("Car", "Petrol engine started horse power=$horsePower")
    }
}
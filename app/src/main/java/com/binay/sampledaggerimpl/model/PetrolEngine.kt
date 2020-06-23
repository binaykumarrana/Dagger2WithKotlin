package com.binay.sampledaggerimpl.model

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d("Car", "Petrol engine started")
    }

}
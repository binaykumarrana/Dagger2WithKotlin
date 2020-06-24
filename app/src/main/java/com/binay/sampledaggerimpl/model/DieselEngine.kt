package com.binay.sampledaggerimpl.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class DieselEngine @Inject constructor(
    @Named("capacity") private val capacity: Int,
    @Named("horsepower") private val horsePower: Int
) : Engine {

    override fun start() {
        Log.d("Car", "Diesel engine started horse power = $horsePower and \ncapacity $capacity")
    }
}
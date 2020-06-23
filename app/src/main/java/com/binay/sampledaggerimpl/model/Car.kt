package com.binay.sampledaggerimpl.model

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels
) {
    fun drive() {
        Log.d("Car", "Driving...")
        engine.start()
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}
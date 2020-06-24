package com.binay.sampledaggerimpl.model

import android.util.Log
import com.binay.sampledaggerimpl.PerActivity
import javax.inject.Inject

@PerActivity
data class Car @Inject constructor(
    private val driver: Driver,
    private val engine: Engine,
    private val wheels: Wheels
) {
    fun drive() {
        Log.d("Car", "$driver name ${driver.name} Driving... ${this.engine}")
        engine.start()
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}
package com.binay.sampledaggerimpl

import android.app.Application
import com.binay.sampledaggerimpl.di.AppComponent
import com.binay.sampledaggerimpl.di.DaggerAppComponent
import com.binay.sampledaggerimpl.di.module.DriverModule

class MyApp : Application() {
    private lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.factory().create(DriverModule("Binay"))
    }

    fun getCarComponent(): AppComponent {
        return component
    }
}
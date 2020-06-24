package com.binay.sampledaggerimpl

import android.app.Application
import com.binay.sampledaggerimpl.di.AppComponent
import com.binay.sampledaggerimpl.di.DaggerAppComponent

class MyApp : Application() {
    private lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }

    fun getCarComponent(): AppComponent {
        return component
    }
}
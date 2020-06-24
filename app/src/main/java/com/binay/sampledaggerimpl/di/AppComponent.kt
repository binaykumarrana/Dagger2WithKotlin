package com.binay.sampledaggerimpl.di

import com.binay.sampledaggerimpl.di.module.DriverModule
import com.binay.sampledaggerimpl.model.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver
}
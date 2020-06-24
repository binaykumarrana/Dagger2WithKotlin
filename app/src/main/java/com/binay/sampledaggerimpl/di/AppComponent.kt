package com.binay.sampledaggerimpl.di

import com.binay.sampledaggerimpl.di.module.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    //fun getActivityComponentBuilder(): ActivityComponent.Builder
    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory{
        fun create(driverModule: DriverModule): AppComponent
    }
}
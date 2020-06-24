package com.binay.sampledaggerimpl.di

import com.binay.sampledaggerimpl.di.module.DriverModule
import com.binay.sampledaggerimpl.di.module.PetrolEngineModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    //fun getDriver(): Driver

    fun getActivityComponent(petrolEngineModule: PetrolEngineModule): ActivityComponent
}
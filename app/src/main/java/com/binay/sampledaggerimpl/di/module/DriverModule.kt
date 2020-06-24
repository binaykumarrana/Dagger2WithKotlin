package com.binay.sampledaggerimpl.di.module

import com.binay.sampledaggerimpl.model.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(val name:String) {

    @Provides
    @Singleton
    fun providesDriver(): Driver {
        return Driver(name)
    }

}

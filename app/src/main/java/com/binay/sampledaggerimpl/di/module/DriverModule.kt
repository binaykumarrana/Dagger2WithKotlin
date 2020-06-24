package com.binay.sampledaggerimpl.di.module

import com.binay.sampledaggerimpl.model.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {
    companion object {
        @Provides
        @Singleton
        fun providesDriver(): Driver {
            return Driver()
        }
    }
}

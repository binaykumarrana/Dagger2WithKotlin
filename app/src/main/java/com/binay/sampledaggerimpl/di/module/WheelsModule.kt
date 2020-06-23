package com.binay.sampledaggerimpl.di.module

import com.binay.sampledaggerimpl.model.Rims
import com.binay.sampledaggerimpl.model.Tires
import com.binay.sampledaggerimpl.model.Wheels
import dagger.Module
import dagger.Provides


@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}
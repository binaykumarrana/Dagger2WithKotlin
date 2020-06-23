package com.binay.sampledaggerimpl.di.module

import com.binay.sampledaggerimpl.model.Engine
import com.binay.sampledaggerimpl.model.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule constructor(private val horsePower: Int) {
    @Provides
    fun provideEngine(): Engine {
        return PetrolEngine(horsePower)
    }
}
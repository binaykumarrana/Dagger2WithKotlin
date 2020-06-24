package com.binay.sampledaggerimpl.di.module

import com.binay.sampledaggerimpl.model.Engine
import com.binay.sampledaggerimpl.model.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule constructor(private val horsePower: Int) {

    @Provides
    fun providesHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: PetrolEngine): Engine {
        return engine
    }
}
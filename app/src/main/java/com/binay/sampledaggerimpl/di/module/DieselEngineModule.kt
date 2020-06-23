package com.binay.sampledaggerimpl.di.module

import com.binay.sampledaggerimpl.model.DieselEngine
import com.binay.sampledaggerimpl.model.Engine
import com.binay.sampledaggerimpl.model.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}
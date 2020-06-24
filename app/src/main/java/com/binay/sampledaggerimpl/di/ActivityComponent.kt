package com.binay.sampledaggerimpl.di

import com.binay.sampledaggerimpl.MainActivity
import com.binay.sampledaggerimpl.PerActivity
import com.binay.sampledaggerimpl.di.module.DieselEngineModule
import com.binay.sampledaggerimpl.di.module.PetrolEngineModule
import com.binay.sampledaggerimpl.di.module.WheelsModule
import com.binay.sampledaggerimpl.model.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface ActivityComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horsepower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("capacity") capacity: Int): Builder
        fun build(): ActivityComponent
    }
}
package com.binay.sampledaggerimpl.di

import com.binay.sampledaggerimpl.MainActivity
import com.binay.sampledaggerimpl.PerActivity
import com.binay.sampledaggerimpl.di.module.DieselEngineModule
import com.binay.sampledaggerimpl.di.module.WheelsModule
import com.binay.sampledaggerimpl.model.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface ActivityComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("horsepower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("capacity") capacity: Int): Builder
        fun build(): ActivityComponent

        fun appComponent(appComponent: AppComponent): Builder
    }
}
package com.binay.sampledaggerimpl.di

import com.binay.sampledaggerimpl.MainActivity
import com.binay.sampledaggerimpl.di.module.WheelsModule
import com.binay.sampledaggerimpl.model.Car
import dagger.Component


@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}
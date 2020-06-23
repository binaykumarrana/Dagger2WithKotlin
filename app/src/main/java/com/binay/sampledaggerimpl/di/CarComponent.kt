package com.binay.sampledaggerimpl.di

import com.binay.sampledaggerimpl.MainActivity
import com.binay.sampledaggerimpl.model.Car
import dagger.Component


@Component
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}
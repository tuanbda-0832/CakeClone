package com.sun.cakeclone.di

import android.content.Context
import com.sun.cakeclone.EnForYouApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [ApplicationModule::class, AndroidSupportInjectionModule::class])
interface ApplicationComponent : AndroidInjector<EnForYouApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }
}
package com.sun.cakeclone

import com.sun.cakeclone.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

/**
 * An [Application] that uses Dagger for Dependency Injection.
 *
 * Also, sets up Timber in the DEBUG BuildConfig. Read Timber's documentation for production setups.
 */

open class EnForYouApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.factory().create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}
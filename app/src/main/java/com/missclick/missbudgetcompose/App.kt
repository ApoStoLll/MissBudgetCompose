package com.missclick.missbudgetcompose

import android.app.Application
import com.missclick.missbudgetcompose.di.appModule
import com.missclick.missbudgetcompose.di.dataModule
import com.missclick.missbudgetcompose.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(appModule, dataModule, domainModule)
        }

    }
}
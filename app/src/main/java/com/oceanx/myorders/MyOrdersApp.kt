package com.oceanx.myorders

import android.app.Application
import com.oceanx.myorders.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyOrdersApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyOrdersApp)
            modules(appModule)
        }
    }
}

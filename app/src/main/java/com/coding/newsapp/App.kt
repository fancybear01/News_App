package com.coding.newsapp

import android.app.Application
import com.coding.newsapp.article.di.articleModule
import com.coding.newsapp.core.di.coreModule
import com.coding.newsapp.news.di.newsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                coreModule,
                newsModule,
                articleModule
            )
        }
    }
}
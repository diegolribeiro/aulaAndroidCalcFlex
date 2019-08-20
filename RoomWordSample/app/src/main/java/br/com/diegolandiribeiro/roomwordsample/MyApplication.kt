package br.com.diegolandiribeiro.roomwordsample

import android.app.Application
import br.com.diegolandiribeiro.roomwordsample.di.dbModule
import br.com.diegolandiribeiro.roomwordsample.di.repositoryModule
import br.com.diegolandiribeiro.roomwordsample.di.uiModule
import br.com.diegolandiribeiro.roomwordsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()

        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(
                listOf(
                    viewModelModule,
                    uiModule,
                    dbModule,
                    repositoryModule
                )
            )
        }
    }
}
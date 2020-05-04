package com.uitprojects.ongoingk

import android.app.Application
import timber.log.Timber


public class OnGoingK : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }else{

        }

    }
}
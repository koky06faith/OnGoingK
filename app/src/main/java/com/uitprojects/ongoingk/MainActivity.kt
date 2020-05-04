package com.uitprojects.ongoingk

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Log.d("AAA", "Emanuel ")
        Timber.i("Emanuel Perez ")
        CoronaVirus()
    }

    private fun CoronaVirus(){
        Timber.d("CoronaVirus")
    }

}

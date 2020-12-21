package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    companion object{
        @SuppressLint("StaticFiledLeak")
        lateinit var context: Context

        const val TOKEN = "hiaLSo950Lwvr5xD"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
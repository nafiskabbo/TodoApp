package com.kabbodev.todo.singleton

import android.app.Application
import android.content.Context
import com.kabbodev.todo.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MyApplication : Application() {

    companion object {
        private lateinit var mInstance: MyApplication

        fun getAppContext(): Context = mInstance.applicationContext
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this

        if (BuildConfig.DEBUG) {
            Timber.plant(object : Timber.DebugTree() {
                override fun log(priority: Int, tag: String?, message: String, t: Throwable?) = super.log(priority, "ayan_$tag", message, t)

                override fun createStackElementTag(element: StackTraceElement): String =
                    String.format("(%s, Line: %s, Method: %s)", super.createStackElementTag(element), element.lineNumber, element.methodName)
            })
        }
    }

}
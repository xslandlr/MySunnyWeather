package com.xsl.mysunnyweather

import android.app.Application
import android.content.Context

/**
 * @Description:     java类作用描述
 * @CreateDate:     2020/11/11 10:13
 * @Author:         Fiora
 */
class MyApplication : Application(){

    companion object{
        const val TOKEN = ""
        lateinit var context : Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
package com.happy.myeggnotification.ui

import android.app.Application
import android.app.NotificationManager
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.happy.myeggnotification.R
import com.happy.myeggnotification.util.sendNotification

class EggTimerViewModel(private val app: Application) : AndroidViewModel(app) {


    fun startTimer(){

        val notificationManager = ContextCompat.getSystemService(
            app,
            NotificationManager::class.java
        ) as NotificationManager
        notificationManager.sendNotification(app.getString(R.string.timer_running), app)

    }
}
package com.happy.myeggnotification.util

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.happy.myeggnotification.MainActivity
import com.happy.myeggnotification.R

private val NOTIFICATION_ID = 0

// TODO: Step 1.1 extension function to send messages (GIVEN)
/**
 * Builds and delivers a notification.
 *
 * @param messageBody, notification text.
 * @param context, activity context.
 */

fun NotificationManager.sendNotification(messageBody: String, applicationContext: Context) {

    val contentIntent = Intent(applicationContext, MainActivity::class.java)
    val contentPendingIntent = PendingIntent.getActivity(
        applicationContext,
        NOTIFICATION_ID,
        contentIntent,
        PendingIntent.FLAG_UPDATE_CURRENT
    )



    // TODO: Step 1.2 get an instance of NotificationCompat.Builder
    val builder = NotificationCompat.Builder(
        applicationContext,
        // TODO: Step 1.8 verify the notification channel name
        applicationContext.getString(R.string.egg_notification_channel_id)
    ).setSmallIcon(R.drawable.cooked_egg)
        .setContentTitle(applicationContext.getString(R.string.notification_title))
        .setContentText(messageBody)

    // TODO: Step 1.4 call notify to send the notification
    // Deliver the notification
    notify(NOTIFICATION_ID, builder.build())


}
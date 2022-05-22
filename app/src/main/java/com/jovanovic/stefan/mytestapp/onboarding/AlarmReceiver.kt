package com.jovanovic.stefan.mytestapp.onboarding


import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.legacy.content.WakefulBroadcastReceiver
import com.jovanovic.stefan.mytestapp.MainActivity
import com.jovanovic.stefan.mytestapp.R
import com.jovanovic.stefan.mytestapp.onboarding.screens.Settings

class AlarmReceiver : WakefulBroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val i = Intent(context,WakefulBroadcastReceiver::class.java)
        intent!!.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val pendingIntent = PendingIntent.getActivity(context,0,i,0)
        startWakefulService(context, i)


        val builder = NotificationCompat.Builder(context!!,"Հաղթանակի Ծրագիր")
            .setSmallIcon(R.drawable.icon)
            .setContentTitle("Հաղթանակի Ծրագիր")
            .setContentText("Ամենօրյա հիշեցում")
            .setAutoCancel(true)
            .setContentIntent(PendingIntent.getActivity(
                context,
                0,
                Intent(context, MainActivity::class.java),
                0
            )
            )
            .setDefaults(NotificationCompat.DEFAULT_ALL)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            //.setContentIntent(pendingIntent)
        val notificationManager = NotificationManagerCompat.from(context)
        notificationManager.notify(123,builder.build())

    }
}
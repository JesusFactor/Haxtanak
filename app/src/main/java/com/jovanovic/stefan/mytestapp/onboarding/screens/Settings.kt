package com.jovanovic.stefan.mytestapp.onboarding.screens

import android.annotation.SuppressLint
import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.icu.util.Calendar
import java.util.*
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.jovanovic.stefan.mytestapp.R
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.jovanovic.stefan.mytestapp.onboarding.AlarmReceiver
import kotlinx.android.synthetic.main.activity_settings2.*
import java.text.SimpleDateFormat


class Settings : AppCompatActivity() {
    /*private val alarmManager = context.getSystemService(ALARM_SERVICE) as AlarmManager
    private val alarmPendingIntent by lazy {
        val intent = Intent(this, AlarmReceiver::class.java)
        PendingIntent.getBroadcast(this, 0,intent,0)
    }*/

    private lateinit var picker : MaterialTimePicker
    private lateinit var calendar: Calendar
    private lateinit var alarmManager: AlarmManager
    private lateinit var pendingIntent: PendingIntent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings2)
        val actionbar = supportActionBar
        actionbar!!.title = "Հիշեցումներ"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        createNotificationChannel()

        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        val btb = AnimationUtils.loadAnimation(this, R.anim.btn1)
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb)
        val btb1 = AnimationUtils.loadAnimation(this, R.anim.btn2)
        val blind = AnimationUtils.loadAnimation(this, R.anim.blind)
        val fade = AnimationUtils.loadAnimation(this, R.anim.fade)

        no.setOnClickListener {
            no.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                Toast.makeText(
                    applicationContext,
                    "Դուք այլևս չեք ստանա հիշեցումներ",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

        /*yes.setOnClickListener {
            yes.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                Toast.makeText(
                    applicationContext,
                    "Դուք կստանաք հիշեցումներ",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }*/

        yes.setOnClickListener{
            showtime()
        }
        no.setOnClickListener {
            cancelAlarm()
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name : CharSequence = "Հաղթանակի Ծրագիր"
            val description = "Channel For Alarm Manager"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel("Հաղթանակի Ծրագիր",name,importance)
            channel.description = description
            val notificationManager = getSystemService(
                NotificationManager::class.java
            )

            notificationManager.createNotificationChannel(channel)
        }
    }

//    private fun showTimePicker() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            picker = MaterialTimePicker.Builder()
//                .setTimeFormat(TimeFormat.CLOCK_12H)
//                .setHour(12)
//                .setMinute(0)
//                .setTitleText("Հաղթանակի Ծրագիր")
//                .build()
//
//            picker.show(supportFragmentManager, "Հաղթանակի Ծրագիր")
//
//            var time = ""
//
//            picker.addOnPositiveButtonClickListener {
//
//                if (picker.hour > 12) {
//                    time =
//                        String.format("%02d", picker.hour - 12) + ":" + String.format(
//                            "%02d",
//                            picker.minute
//                        ) + "PM"
//
//
//                } else {
//                    time =
//                        String.format("%02d", picker.hour) + ":" + String.format(
//                            "%02d",
//                            picker.minute
//                        ) + "AM"
//                }
//
//
//                calendar = android.icu.util.Calendar.getInstance()
//                calendar[java.util.Calendar.HOUR_OF_DAY] = picker.hour
//                calendar[java.util.Calendar.MINUTE] = picker.minute
//                calendar[java.util.Calendar.SECOND] = 0
//                calendar[java.util.Calendar.MILLISECOND] = 0
//                setAlarm(time)
//            }
//            //val cal = Calendar.getInstance()
//            //val timeSetListener = TimePickerDialog.OnTimeSetListener { timepicker, hour, minute ->
//            //    cal.set(Calendar.HOUR_OF_DAY, hour)
//            //    cal.set(Calendar.MINUTE, minute)
//
//            //}
//            //TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()
//        }
//    }
//
    private fun cancelAlarm() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            val intent = Intent(this,AlarmReceiver::class.java)

            pendingIntent = PendingIntent.getBroadcast(this,0,intent,0)

            alarmManager.cancel(pendingIntent)
            Toast.makeText(this, "Դուք չեք ստանա ամենօրյա հիշեցումներ", Toast.LENGTH_LONG).show()
        }
    }

    private fun showtime() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            calendar = Calendar.getInstance()
            val timeSetListener = TimePickerDialog.OnTimeSetListener{timepicker, hour, minute: Int ->
                calendar.set(Calendar.HOUR_OF_DAY, hour)
                calendar.set(Calendar.MINUTE, minute)
                var time_check= SimpleDateFormat("HH:mm").format(calendar.time)
                setAlarm(time_check)
            }
            TimePickerDialog(this, timeSetListener, calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE), true).show()
        }
    }

    private fun setAlarm(time: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            val intent = Intent(this, AlarmReceiver::class.java)

            pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

            alarmManager.setRepeating(

                AlarmManager.RTC_WAKEUP, calendar.timeInMillis,
                AlarmManager.INTERVAL_DAY, pendingIntent

            )
            Toast.makeText(this, "Դուք կստանաք ամենօրյա հիշեցումներ՝ ժամը։ $time", Toast.LENGTH_LONG).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

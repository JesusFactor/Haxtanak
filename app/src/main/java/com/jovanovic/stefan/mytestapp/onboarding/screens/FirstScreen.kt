package com.jovanovic.stefan.mytestapp.onboarding.screens

import android.app.*
import android.content.Context
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils

import androidx.viewpager2.widget.ViewPager2
import com.jovanovic.stefan.mytestapp.R
import kotlinx.android.synthetic.main.fragment_first_screen.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.jovanovic.stefan.mytestapp.onboarding.AlarmReceiver
import kotlinx.android.synthetic.main.fragment_view_pager.*
import java.text.SimpleDateFormat

class FirstScreen : Fragment() {

    private lateinit var picker : MaterialTimePicker
    private lateinit var calendar: Calendar
    private lateinit var alarmManager: AlarmManager
    private lateinit var pendingIntent: PendingIntent

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_screen, container, false)
        val ttb = AnimationUtils.loadAnimation(activity,R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(activity,R.anim.stb)
        val imageView = view.findViewById<ImageView>(R.id.imageView) as ImageView
        val title = view.findViewById<TextView>(R.id.title) as TextView
        val description = view.findViewById<TextView>(R.id.description) as TextView
        val next3 = view.findViewById<TextView>(R.id.next3) as TextView
        val next = view.findViewById<TextView>(R.id.next) as TextView
        val btb1 = AnimationUtils.loadAnimation(activity,R.anim.btn2)

        createNotificationChannel()

        imageView.startAnimation(ttb)
        title.startAnimation(stb)
        description.startAnimation(stb)
        next3.startAnimation(btb1)
        next.startAnimation(btb1)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.next.setOnClickListener {
            view.next.animate().apply {
                showtime()
                viewPager!!.currentItem = 1
            }
        }

        view.next3.setOnClickListener {
            view.next.animate().apply {
                cancelAlarm()
                viewPager!!.currentItem = 1
            }
        }
        return view
    }

    private fun cancelAlarm() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            alarmManager= requireActivity().getSystemService(AppCompatActivity.ALARM_SERVICE) as AlarmManager
            val intent: Intent = Intent(activity, AlarmReceiver::class.java)

            pendingIntent = PendingIntent.getBroadcast(activity, 0, intent, 0)

            alarmManager.cancel(pendingIntent)
            Toast.makeText(activity, "Դուք չեք ստանա ամենօրյա հիշեցումներ", Toast.LENGTH_LONG).show()
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name : CharSequence = "Հաղթանակի Ծրագիր"
            val description = "Channel For Alarm Manager"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel("Հաղթանակի Ծրագիր",name,importance)
            channel.description = description
            val notificationManager= requireActivity().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
            notificationManager.createNotificationChannel(channel)
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
            TimePickerDialog(activity, timeSetListener, calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE), true).show()
        }
    }

    private fun showTimePicker() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            picker = MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_12H)
                .setHour(12)
                .setMinute(0)
                .setTitleText("Հաղթանակի Ծրագիր")
                .build()

            activity?.let { picker.show(it.supportFragmentManager, "Հաղթանակի Ծրագիր") }

            var time = ""

            picker.addOnPositiveButtonClickListener {

                if (picker.hour > 12) {
                    time =
                        String.format("%02d", picker.hour - 12) + ":" + String.format(
                            "%02d",
                            picker.minute
                        ) + "PM"


                } else {
                    time =
                        String.format("%02d", picker.hour) + ":" + String.format(
                            "%02d",
                            picker.minute
                        ) + "AM"
                }


                calendar = android.icu.util.Calendar.getInstance()
                calendar[java.util.Calendar.HOUR_OF_DAY] = picker.hour
                calendar[java.util.Calendar.MINUTE] = picker.minute
                calendar[java.util.Calendar.SECOND] = 0
                calendar[java.util.Calendar.MILLISECOND] = 0
                setAlarm(time)
            }
        }
    }


    private fun setAlarm(time: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            alarmManager= requireActivity().getSystemService(AppCompatActivity.ALARM_SERVICE) as AlarmManager
            val intent: Intent = Intent(activity, AlarmReceiver::class.java)

            pendingIntent = PendingIntent.getBroadcast(activity, 0, intent, 0)

            alarmManager.setRepeating(

                AlarmManager.RTC_WAKEUP, calendar.timeInMillis,
                AlarmManager.INTERVAL_DAY, pendingIntent

            )
            Toast.makeText(activity, "Դուք կստանաք ամենօրյա հիշեցումներ՝ ժամը. $time", Toast.LENGTH_LONG).show()
        }

    }
}

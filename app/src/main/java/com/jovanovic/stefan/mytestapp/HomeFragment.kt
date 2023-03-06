package com.jovanovic.stefan.mytestapp

import android.app.AlertDialog
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.EventLog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import com.jovanovic.stefan.mytestapp.onboarding.screens.About
import com.jovanovic.stefan.mytestapp.onboarding.screens.Settings
import com.tapadoo.alerter.Alerter
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_mart.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?{
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val ttb = AnimationUtils.loadAnimation(activity,R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(activity,R.anim.stb)
        val button1 = view.findViewById<Button>(R.id.հունվար) as Button
        val button2 = view.findViewById<Button>(R.id.փետրվար) as Button
        val button3 = view.findViewById<Button>(R.id.մարտ) as Button
        val button4 = view.findViewById<Button>(R.id.ապրիլ) as Button
        val button5 = view.findViewById<Button>(R.id.մայիս) as Button
        val button6 = view.findViewById<Button>(R.id.հունիս) as Button
        val button7 = view.findViewById<Button>(R.id.հուլիս) as Button
        val button8 = view.findViewById<Button>(R.id.օգոստոս) as Button
        val button9 = view.findViewById<Button>(R.id.սեպտեմբեր) as Button
        val button10 = view.findViewById<Button>(R.id.հոկտեմբեր) as Button
        val button11 = view.findViewById<Button>(R.id.նոյեմբեր) as Button
        val button12 = view.findViewById<Button>(R.id.դեկտեմբեր) as Button
        //val settings = view.findViewById<Button>(R.id.settings) as Button
        //val about_us = view.findViewById<Button>(R.id.about_us) as Button
        val btb = AnimationUtils.loadAnimation(activity,R.anim.btn1)
        val btb1 = AnimationUtils.loadAnimation(activity,R.anim.btn2)
        button1.startAnimation(stb)
        button2.startAnimation(stb)
        button3.startAnimation(stb)
        button4.startAnimation(stb)
        button5.startAnimation(stb)
        button7.startAnimation(stb)
        button8.startAnimation(stb)
        button9.startAnimation(stb)
        button10.startAnimation(stb)
        button6.startAnimation(stb)
        button11.startAnimation(stb)
        button12.startAnimation(stb)
        view.bottombar.startAnimation(stb)
        view.settings.startAnimation(stb)
        view.logo.startAnimation(stb)

        val getpref = activity?.getSharedPreferences("MyPref", MODE_PRIVATE)
        val editor = getpref?.edit()

        button1.setOnClickListener {
            val intent = Intent(activity, HunvarActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(activity, PetrvarActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(activity, MartActivity::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(activity, AprilActivity::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(activity, MayisActivity::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(activity, HunisActivity::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(activity, HulisActivity::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(activity, OgostosActivity::class.java)
            startActivity(intent)
        }


        button9.setOnClickListener {
            val intent = Intent(activity, SeptemberActivity::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(activity, HoktemberActivity::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(activity, NoyemberActivity::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(activity, DektemberActivity::class.java)
            startActivity(intent)
        }
        view.settings.setOnClickListener {
            val intent = Intent(activity, Settings::class.java)
            startActivity(intent)
        }
        view.logo.setOnClickListener {
            val intent = Intent(activity, About::class.java)
            startActivity(intent)
        }


        return view
    }
}
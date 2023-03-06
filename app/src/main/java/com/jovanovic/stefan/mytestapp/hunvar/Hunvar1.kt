package com.jovanovic.stefan.mytestapp.hunvar

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jovanovic.stefan.mytestapp.R
import com.jovanovic.stefan.mytestapp.days_words.*
import kotlinx.android.synthetic.main.activity_hunvar.*
import kotlinx.android.synthetic.main.activity_hunvar1.*

class Hunvar1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hunvar1)

        val SharedPreferences = this.getSharedPreferences("MyPref", MODE_PRIVATE)
        val SharedEditor = SharedPreferences.edit()

        if (SharedPreferences.getBoolean("hunvar_day1_word1",false)){
            button1.setTextColor(Color.WHITE)
            button1.setBackgroundResource(R.drawable.fullblueroundstylefordays)
        }

        if (SharedPreferences.getBoolean("hunvar_day1_word2",false)){
            button2.setTextColor(Color.WHITE)
            button2.setBackgroundResource(R.drawable.fullblueroundstylefordays)
        }

        if (SharedPreferences.getBoolean("hunvar_day1_word3",false)){
            button3.setTextColor(Color.WHITE)
            button3.setBackgroundResource(R.drawable.fullblueroundstylefordays)
        }

        val actionbar = supportActionBar
        actionbar!!.title = "Հունվար 1"

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        button1.setOnClickListener {
            if (!SharedPreferences.getBoolean("hunvar_day1_word1",false)) {
                SharedEditor.apply {
                    putBoolean("hunvar_day1_word1", true)
                    apply()
                    putInt("hunvar_day1",SharedPreferences.getInt("hunvar_day1",0) + 1)
                    apply()
                }

                button1.setTextColor(Color.WHITE)
                button1.setBackgroundResource(R.drawable.fullblueroundstylefordays)

                /*if (SharedPreferences.getInt("hunvar_day1", 0) == 1) day_1.setBackgroundResource(R.drawable.thirdroundcoloredbutton)
                else if (SharedPreferences.getInt("hunvar_day1", 0) == 2) day_1.setBackgroundResource(R.drawable.halfbluecirclestyle)
                else if (SharedPreferences.getInt("hunvar_day1", 0) == 3) day_1.setBackgroundResource(R.drawable.fullbluecirclestyle)*/
            }
            val intent = Intent(this,HunvarDay1Word1::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            SharedEditor.apply {
                if (!SharedPreferences.getBoolean("hunvar_day1_word2",false)) {
                    SharedEditor.apply {
                        putBoolean("hunvar_day1_word2", true)
                        apply()
                        putInt("hunvar_day1",SharedPreferences.getInt("hunvar_day1",0) + 1)
                        apply()
                    }
                    button2.setTextColor(Color.WHITE)
                    button2.setBackgroundResource(R.drawable.fullblueroundstylefordays)
                }
                /*if (SharedPreferences.getInt("hunvar_day1", 0) == 1)    day_1.setBackgroundResource(R.drawable.thirdroundcoloredbutton)
                else if (SharedPreferences.getInt("hunvar_day1", 0) == 2) day_1.setBackgroundResource(R.drawable.halfbluecirclestyle)
                else if (SharedPreferences.getInt("hunvar_day1", 0) == 3) day_1.setBackgroundResource(R.drawable.fullbluecirclestyle)*/
            }
            val intent = Intent(this,HunvarDay1Word2::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            SharedEditor.apply {
                if (!SharedPreferences.getBoolean("hunvar_day1_word3",false)) {
                    SharedEditor.apply {
                        putBoolean("hunvar_day1_word3", true)
                        apply()
                        putInt("hunvar_day1",SharedPreferences.getInt("hunvar_day1",0) + 1)
                        apply()
                    }
                    button3.setTextColor(Color.WHITE)
                    button3.setBackgroundResource(R.drawable.fullblueroundstylefordays)
                }
                /*if (SharedPreferences.getInt("hunvar_day1", 0) == 1) day_1.setBackgroundResource(R.drawable.thirdroundcoloredbutton)
                else if (SharedPreferences.getInt("hunvar_day1", 0) == 2) day_1.setBackgroundResource(R.drawable.halfbluecirclestyle)
                else if (SharedPreferences.getInt("hunvar_day1", 0) == 3) day_1.setBackgroundResource(R.drawable.fullbluecirclestyle)*/
            }
            val intent = Intent(this,HunvarDay1Word3::class.java)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

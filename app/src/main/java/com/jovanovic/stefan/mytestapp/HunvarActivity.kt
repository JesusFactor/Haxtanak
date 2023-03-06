package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.hunvar.*
import kotlinx.android.synthetic.main.activity_hunvar.*
import kotlinx.android.synthetic.main.activity_hunvar1.*

class HunvarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hunvar)

        val actionbar = supportActionBar

        actionbar!!.title = "Հունվար"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        val SharedPreferences = this.getSharedPreferences("MyPref", MODE_PRIVATE)

        when {
            SharedPreferences.getInt("hunvar_day1", 0) == 1 -> day_1.setBackgroundResource(R.drawable.thirdroundcoloredbutton)
            SharedPreferences.getInt("hunvar_day1", 0) == 2 -> day_1.setBackgroundResource(R.drawable.halfbluecirclestyle)
            SharedPreferences.getInt("hunvar_day1", 0) == 3 -> day_1.setBackgroundResource(R.drawable.fullbluecirclestyle)
        }

        day_1.setOnClickListener {
            val intent = Intent(this, Hunvar1::class.java)
            startActivity(intent)
        }
        day_2.setOnClickListener {
            val intent = Intent(this,Hunvar2::class.java)
            startActivity(intent)
        }
        day_3.setOnClickListener {
            val intent = Intent(this,Hunvar3::class.java)
            startActivity(intent)
        }
        day_4.setOnClickListener {
            val intent = Intent(this,Hunvar4::class.java)
            startActivity(intent)
        }

        day_5.setOnClickListener {
            val intent = Intent(this,Hunvar5::class.java)
            startActivity(intent)
        }

        day_6.setOnClickListener {
            val intent = Intent(this,Hunvar6::class.java)
            startActivity(intent)
        }

        day_7.setOnClickListener {
            val intent = Intent(this,Hunvar7::class.java)
            startActivity(intent)
        }

        day_8.setOnClickListener {
            val intent = Intent(this,Hunvar8::class.java)
            startActivity(intent)
        }

        day_9.setOnClickListener {
            val intent = Intent(this,Hunvar9::class.java)
            startActivity(intent)
        }

        day_10.setOnClickListener {
            val intent = Intent(this,Hunvar10::class.java)
            startActivity(intent)
        }

        day_11.setOnClickListener {
            val intent = Intent(this,Hunvar11::class.java)
            startActivity(intent)
        }

        day_12.setOnClickListener {
            val intent = Intent(this,Hunvar12::class.java)
            startActivity(intent)
        }

        day_13.setOnClickListener {
            val intent = Intent(this,Hunvar13::class.java)
            startActivity(intent)
        }

        day_14.setOnClickListener {
            val intent = Intent(this,Hunvar14::class.java)
            startActivity(intent)
        }

        day_15.setOnClickListener {
            val intent = Intent(this,Hunvar15::class.java)
            startActivity(intent)
        }

        day_16.setOnClickListener {
            val intent = Intent(this,Hunvar16::class.java)
            startActivity(intent)
        }

        day_17.setOnClickListener {
            val intent = Intent(this,Hunvar17::class.java)
            startActivity(intent)
        }

        day_18.setOnClickListener {
            val intent = Intent(this,Hunvar18::class.java)
            startActivity(intent)
        }
        day_19.setOnClickListener {
            val intent = Intent(this,Hunvar19::class.java)
            startActivity(intent)
        }

        day_20.setOnClickListener {
            val intent = Intent(this,Hunvar20::class.java)
            startActivity(intent)
        }

        day_21.setOnClickListener {
            val intent = Intent(this,Hunvar21::class.java)
            startActivity(intent)
        }
        day_22.setOnClickListener {
            val intent = Intent(this,Hunvar22::class.java)
            startActivity(intent)
        }
        day_23.setOnClickListener {
            val intent = Intent(this,Hunvar23::class.java)
            startActivity(intent)
        }

        day_24.setOnClickListener {
            val intent = Intent(this,Hunvar24::class.java)
            startActivity(intent)
        }

        day_25.setOnClickListener {
            val intent = Intent(this,Hunvar25::class.java)
            startActivity(intent)
        }

        day_26.setOnClickListener {
            val intent = Intent(this,Hunvar26::class.java)
            startActivity(intent)
        }

        day_27.setOnClickListener {
            val intent = Intent(this,Hunvar27::class.java)
            startActivity(intent)
        }

        day_28.setOnClickListener {
            val intent = Intent(this,Hunvar28::class.java)
            startActivity(intent)
        }

        day_29.setOnClickListener {
            val intent = Intent(this,Hunvar29::class.java)
            startActivity(intent)
        }

        day_30.setOnClickListener {
            val intent = Intent(this,Hunvar30::class.java)
            startActivity(intent)
        }

        day_31.setOnClickListener {
            val intent = Intent(this,Hunvar31::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.mart.*
import kotlinx.android.synthetic.main.activity_mart.*

class MartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mart)
        val actionbar = supportActionBar
        actionbar!!.title = "Մարտ"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))
        day_1.setOnClickListener {
            val intent = Intent(this, Mart1::class.java)
            startActivity(intent)
        }
        day_2.setOnClickListener {
            val intent = Intent(this,Mart2::class.java)
            startActivity(intent)
        }
        day_3.setOnClickListener {
            val intent = Intent(this,Mart3::class.java)
            startActivity(intent)
        }
        day_4.setOnClickListener {
            val intent = Intent(this,Mart4::class.java)
            startActivity(intent)
        }

        day_5.setOnClickListener {
            val intent = Intent(this,Mart5::class.java)
            startActivity(intent)
        }

        day_6.setOnClickListener {
            val intent = Intent(this,Mart6::class.java)
            startActivity(intent)
        }

        day_7.setOnClickListener {
            val intent = Intent(this,Mart7::class.java)
            startActivity(intent)
        }

        day_8.setOnClickListener {
            val intent = Intent(this,Mart8::class.java)
            startActivity(intent)
        }

        day_9.setOnClickListener {
            val intent = Intent(this,Mart9::class.java)
            startActivity(intent)
        }

        day_10.setOnClickListener {
            val intent = Intent(this,Mart10::class.java)
            startActivity(intent)
        }

        day_11.setOnClickListener {
            val intent = Intent(this,Mart11::class.java)
            startActivity(intent)
        }

        day_12.setOnClickListener {
            val intent = Intent(this,Mart12::class.java)
            startActivity(intent)
        }

        day_13.setOnClickListener {
            val intent = Intent(this,Mart13::class.java)
            startActivity(intent)
        }

        day_14.setOnClickListener {
            val intent = Intent(this,Mart14::class.java)
            startActivity(intent)
        }

        day_15.setOnClickListener {
            val intent = Intent(this,Mart15::class.java)
            startActivity(intent)
        }

        day_16.setOnClickListener {
            val intent = Intent(this,Mart16::class.java)
            startActivity(intent)
        }

        day_17.setOnClickListener {
            val intent = Intent(this,Mart17::class.java)
            startActivity(intent)
        }

        day_18.setOnClickListener {
            val intent = Intent(this,Mart18::class.java)
            startActivity(intent)
        }
        day_19.setOnClickListener {
            val intent = Intent(this,Mart19::class.java)
            startActivity(intent)
        }

        day_20.setOnClickListener {
            val intent = Intent(this,Mart20::class.java)
            startActivity(intent)
        }

        day_21.setOnClickListener {
            val intent = Intent(this,Mart21::class.java)
            startActivity(intent)
        }
        day_22.setOnClickListener {
            val intent = Intent(this,Mart22::class.java)
            startActivity(intent)
        }
        day_23.setOnClickListener {
            val intent = Intent(this,Mart23::class.java)
            startActivity(intent)
        }

        day_24.setOnClickListener {
            val intent = Intent(this,Mart24::class.java)
            startActivity(intent)
        }

        day_25.setOnClickListener {
            val intent = Intent(this,Mart25::class.java)
            startActivity(intent)
        }

        day_26.setOnClickListener {
            val intent = Intent(this,Mart26::class.java)
            startActivity(intent)
        }

        day_27.setOnClickListener {
            val intent = Intent(this,Mart27::class.java)
            startActivity(intent)
        }

        day_28.setOnClickListener {
            val intent = Intent(this,Mart28::class.java)
            startActivity(intent)
        }

        day_29.setOnClickListener {
            val intent = Intent(this,Mart29::class.java)
            startActivity(intent)
        }

        day_30.setOnClickListener {
            val intent = Intent(this,Mart30::class.java)
            startActivity(intent)
        }

        day_31.setOnClickListener {
            val intent = Intent(this,Mart31::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
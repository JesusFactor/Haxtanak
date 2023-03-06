package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.hoktember.*
import kotlinx.android.synthetic.main.activity_hoktember.*

class HoktemberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hoktember)
        val actionbar = supportActionBar
        actionbar!!.title = "Հոկտեմբեր"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))
        day_1.setOnClickListener {
            val intent = Intent(this, Hoktember1::class.java)
            startActivity(intent)
        }
        day_2.setOnClickListener {
            val intent = Intent(this,Hoktember2::class.java)
            startActivity(intent)
        }
        day_3.setOnClickListener {
            val intent = Intent(this,Hoktember3::class.java)
            startActivity(intent)
        }
        day_4.setOnClickListener {
            val intent = Intent(this,Hoktember4::class.java)
            startActivity(intent)
        }

        day_5.setOnClickListener {
            val intent = Intent(this,Hoktember5::class.java)
            startActivity(intent)
        }

        day_6.setOnClickListener {
            val intent = Intent(this,Hoktember6::class.java)
            startActivity(intent)
        }

        day_7.setOnClickListener {
            val intent = Intent(this,Hoktember7::class.java)
            startActivity(intent)
        }

        day_8.setOnClickListener {
            val intent = Intent(this,Hoktember8::class.java)
            startActivity(intent)
        }

        day_9.setOnClickListener {
            val intent = Intent(this,Hoktember9::class.java)
            startActivity(intent)
        }

        day_10.setOnClickListener {
            val intent = Intent(this,Hoktember10::class.java)
            startActivity(intent)
        }

        day_11.setOnClickListener {
            val intent = Intent(this,Hoktember11::class.java)
            startActivity(intent)
        }

        day_12.setOnClickListener {
            val intent = Intent(this,Hoktember12::class.java)
            startActivity(intent)
        }

        day_13.setOnClickListener {
            val intent = Intent(this,Hoktember13::class.java)
            startActivity(intent)
        }

        day_14.setOnClickListener {
            val intent = Intent(this,Hoktember14::class.java)
            startActivity(intent)
        }

        day_15.setOnClickListener {
            val intent = Intent(this,Hoktember15::class.java)
            startActivity(intent)
        }

        day_16.setOnClickListener {
            val intent = Intent(this,Hoktember16::class.java)
            startActivity(intent)
        }

        day_17.setOnClickListener {
            val intent = Intent(this,Hoktember17::class.java)
            startActivity(intent)
        }

        day_18.setOnClickListener {
            val intent = Intent(this,Hoktember18::class.java)
            startActivity(intent)
        }
        day_19.setOnClickListener {
            val intent = Intent(this,Hoktember19::class.java)
            startActivity(intent)
        }

        day_20.setOnClickListener {
            val intent = Intent(this,Hoktember20::class.java)
            startActivity(intent)
        }

        day_21.setOnClickListener {
            val intent = Intent(this,Hoktember21::class.java)
            startActivity(intent)
        }
        day_22.setOnClickListener {
            val intent = Intent(this,Hoktember22::class.java)
            startActivity(intent)
        }
        day_23.setOnClickListener {
            val intent = Intent(this,Hoktember23::class.java)
            startActivity(intent)
        }

        day_24.setOnClickListener {
            val intent = Intent(this,Hoktember24::class.java)
            startActivity(intent)
        }

        day_25.setOnClickListener {
            val intent = Intent(this,Hoktember25::class.java)
            startActivity(intent)
        }

        day_26.setOnClickListener {
            val intent = Intent(this,Hoktember26::class.java)
            startActivity(intent)
        }

        day_27.setOnClickListener {
            val intent = Intent(this,Hoktember27::class.java)
            startActivity(intent)
        }

        day_28.setOnClickListener {
            val intent = Intent(this,Hoktember28::class.java)
            startActivity(intent)
        }

        day_29.setOnClickListener {
            val intent = Intent(this,Hoktember29::class.java)
            startActivity(intent)
        }

        day_30.setOnClickListener {
            val intent = Intent(this,Hoktember30::class.java)
            startActivity(intent)
        }

        day_31.setOnClickListener {
            val intent = Intent(this,Hoktember31::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}

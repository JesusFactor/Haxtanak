package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.noyember.*
import kotlinx.android.synthetic.main.activity_noyember.*

class NoyemberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noyember)
        val actionbar = supportActionBar
        actionbar!!.title = "Նոյեմբեր"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))
        day_1.setOnClickListener {
            val intent = Intent(this, Noyember1::class.java)
            startActivity(intent)
        }
        day_2.setOnClickListener {
            val intent = Intent(this,Noyember2::class.java)
            startActivity(intent)
        }
        day_3.setOnClickListener {
            val intent = Intent(this,Noyember3::class.java)
            startActivity(intent)
        }
        day_4.setOnClickListener {
            val intent = Intent(this,Noyember4::class.java)
            startActivity(intent)
        }

        day_5.setOnClickListener {
            val intent = Intent(this,Noyember5::class.java)
            startActivity(intent)
        }

        day_6.setOnClickListener {
            val intent = Intent(this,Noyember6::class.java)
            startActivity(intent)
        }

        day_7.setOnClickListener {
            val intent = Intent(this,Noyember7::class.java)
            startActivity(intent)
        }

        day_8.setOnClickListener {
            val intent = Intent(this,Noyember8::class.java)
            startActivity(intent)
        }

        day_9.setOnClickListener {
            val intent = Intent(this,Noyember9::class.java)
            startActivity(intent)
        }

        day_10.setOnClickListener {
            val intent = Intent(this,Noyember10::class.java)
            startActivity(intent)
        }

        day_11.setOnClickListener {
            val intent = Intent(this,Noyember11::class.java)
            startActivity(intent)
        }

        day_12.setOnClickListener {
            val intent = Intent(this,Noyember12::class.java)
            startActivity(intent)
        }

        day_13.setOnClickListener {
            val intent = Intent(this,Noyember13::class.java)
            startActivity(intent)
        }

        day_14.setOnClickListener {
            val intent = Intent(this,Noyember14::class.java)
            startActivity(intent)
        }

        day_15.setOnClickListener {
            val intent = Intent(this,Noyember15::class.java)
            startActivity(intent)
        }

        day_16.setOnClickListener {
            val intent = Intent(this,Noyember16::class.java)
            startActivity(intent)
        }

        day_17.setOnClickListener {
            val intent = Intent(this,Noyember17::class.java)
            startActivity(intent)
        }

        day_18.setOnClickListener {
            val intent = Intent(this,Noyember18::class.java)
            startActivity(intent)
        }
        day_19.setOnClickListener {
            val intent = Intent(this,Noyember19::class.java)
            startActivity(intent)
        }

        day_20.setOnClickListener {
            val intent = Intent(this,Noyember20::class.java)
            startActivity(intent)
        }

        day_21.setOnClickListener {
            val intent = Intent(this,Noyember21::class.java)
            startActivity(intent)
        }
        day_22.setOnClickListener {
            val intent = Intent(this,Noyember22::class.java)
            startActivity(intent)
        }
        day_23.setOnClickListener {
            val intent = Intent(this,Noyember23::class.java)
            startActivity(intent)
        }

        day_24.setOnClickListener {
            val intent = Intent(this,Noyember24::class.java)
            startActivity(intent)
        }

        day_25.setOnClickListener {
            val intent = Intent(this,Noyember25::class.java)
            startActivity(intent)
        }

        day_26.setOnClickListener {
            val intent = Intent(this,Noyember26::class.java)
            startActivity(intent)
        }

        day_27.setOnClickListener {
            val intent = Intent(this,Noyember27::class.java)
            startActivity(intent)
        }

        day_28.setOnClickListener {
            val intent = Intent(this,Noyember28::class.java)
            startActivity(intent)
        }

        day_29.setOnClickListener {
            val intent = Intent(this,Noyember29::class.java)
            startActivity(intent)
        }

        day_30.setOnClickListener {
            val intent = Intent(this,Noyember30::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}

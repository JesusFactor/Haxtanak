package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.hulis.*
import kotlinx.android.synthetic.main.activity_hulis.*

class HulisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hulis)
        val actionbar = supportActionBar
        actionbar!!.title = "Հուլիս"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))
        day_1.setOnClickListener {
            val intent = Intent(this, Hulis1::class.java)
            startActivity(intent)
        }
        day_2.setOnClickListener {
            val intent = Intent(this,Hulis2::class.java)
            startActivity(intent)
        }
        day_3.setOnClickListener {
            val intent = Intent(this,Hulis3::class.java)
            startActivity(intent)
        }
        day_4.setOnClickListener {
            val intent = Intent(this,Hulis4::class.java)
            startActivity(intent)
        }

        day_5.setOnClickListener {
            val intent = Intent(this,Hulis5::class.java)
            startActivity(intent)
        }

        day_6.setOnClickListener {
            val intent = Intent(this,Hulis6::class.java)
            startActivity(intent)
        }

        day_7.setOnClickListener {
            val intent = Intent(this,Hulis7::class.java)
            startActivity(intent)
        }

        day_8.setOnClickListener {
            val intent = Intent(this,Hulis8::class.java)
            startActivity(intent)
        }

        day_9.setOnClickListener {
            val intent = Intent(this,Hulis9::class.java)
            startActivity(intent)
        }

        day_10.setOnClickListener {
            val intent = Intent(this,Hulis10::class.java)
            startActivity(intent)
        }

        day_11.setOnClickListener {
            val intent = Intent(this,Hulis11::class.java)
            startActivity(intent)
        }

        day_12.setOnClickListener {
            val intent = Intent(this,Hulis12::class.java)
            startActivity(intent)
        }

        day_13.setOnClickListener {
            val intent = Intent(this,Hulis13::class.java)
            startActivity(intent)
        }

        day_14.setOnClickListener {
            val intent = Intent(this,Hulis14::class.java)
            startActivity(intent)
        }

        day_15.setOnClickListener {
            val intent = Intent(this,Hulis15::class.java)
            startActivity(intent)
        }

        day_16.setOnClickListener {
            val intent = Intent(this,Hulis16::class.java)
            startActivity(intent)
        }

        day_17.setOnClickListener {
            val intent = Intent(this,Hulis17::class.java)
            startActivity(intent)
        }

        day_18.setOnClickListener {
            val intent = Intent(this,Hulis18::class.java)
            startActivity(intent)
        }
        day_19.setOnClickListener {
            val intent = Intent(this,Hulis19::class.java)
            startActivity(intent)
        }

        day_20.setOnClickListener {
            val intent = Intent(this,Hulis20::class.java)
            startActivity(intent)
        }

        day_21.setOnClickListener {
            val intent = Intent(this,Hulis21::class.java)
            startActivity(intent)
        }
        day_22.setOnClickListener {
            val intent = Intent(this,Hulis22::class.java)
            startActivity(intent)
        }
        day_23.setOnClickListener {
            val intent = Intent(this,Hulis23::class.java)
            startActivity(intent)
        }

        day_24.setOnClickListener {
            val intent = Intent(this,Hulis24::class.java)
            startActivity(intent)
        }

        day_25.setOnClickListener {
            val intent = Intent(this,Hulis25::class.java)
            startActivity(intent)
        }

        day_26.setOnClickListener {
            val intent = Intent(this,Hulis26::class.java)
            startActivity(intent)
        }

        day_27.setOnClickListener {
            val intent = Intent(this,Hulis27::class.java)
            startActivity(intent)
        }

        day_28.setOnClickListener {
            val intent = Intent(this,Hulis28::class.java)
            startActivity(intent)
        }

        day_29.setOnClickListener {
            val intent = Intent(this,Hulis29::class.java)
            startActivity(intent)
        }

        day_30.setOnClickListener {
            val intent = Intent(this,Hulis30::class.java)
            startActivity(intent)
        }

        day_31.setOnClickListener {
            val intent = Intent(this,Hulis31::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}

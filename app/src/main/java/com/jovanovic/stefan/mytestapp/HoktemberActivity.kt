package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.hoktember.*
import com.jovanovic.stefan.mytestapp.hoktember.Hoktember29
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
        button1.setOnClickListener {
            val intent = Intent(this, Hoktember1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,Hoktember2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,Hoktember3::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,Hoktember4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,Hoktember5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this,Hoktember6::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this,Hoktember7::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this,Hoktember8::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(this,Hoktember9::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(this,Hoktember10::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(this,Hoktember11::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this,Hoktember12::class.java)
            startActivity(intent)
        }

        button13.setOnClickListener {
            val intent = Intent(this,Hoktember13::class.java)
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(this,Hoktember14::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(this,Hoktember15::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(this,Hoktember16::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            val intent = Intent(this,Hoktember17::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(this,Hoktember18::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this,Hoktember19::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(this,Hoktember20::class.java)
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(this,Hoktember21::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this,Hoktember22::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this,Hoktember23::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(this,Hoktember24::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(this,Hoktember25::class.java)
            startActivity(intent)
        }

        button26.setOnClickListener {
            val intent = Intent(this,Hoktember26::class.java)
            startActivity(intent)
        }

        button27.setOnClickListener {
            val intent = Intent(this,Hoktember27::class.java)
            startActivity(intent)
        }

        button28.setOnClickListener {
            val intent = Intent(this,Hoktember28::class.java)
            startActivity(intent)
        }

        button29.setOnClickListener {
            val intent = Intent(this,Hoktember29::class.java)
            startActivity(intent)
        }

        button30.setOnClickListener {
            val intent = Intent(this,Hoktember30::class.java)
            startActivity(intent)
        }

        button31.setOnClickListener {
            val intent = Intent(this,Hoktember31::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.mayis.*
import kotlinx.android.synthetic.main.activity_mayis.*

class MayisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mayis)
        val actionbar = supportActionBar
        actionbar!!.title = "Մայիս"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))
        button1.setOnClickListener {
            val intent = Intent(this, Mayis1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,Mayis2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,Mayis3::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,Mayis4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,Mayis5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this,Mayis6::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this,Mayis7::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this,Mayis8::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(this,Mayis9::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(this,Mayis10::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(this,Mayis11::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this,Mayis12::class.java)
            startActivity(intent)
        }

        button13.setOnClickListener {
            val intent = Intent(this,Mayis13::class.java)
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(this,Mayis14::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(this,Mayis15::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(this,Mayis16::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            val intent = Intent(this,Mayis17::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(this,Mayis18::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this,Mayis19::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(this,Mayis20::class.java)
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(this,Mayis21::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this,Mayis22::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this,Mayis23::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(this,Mayis24::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(this,Mayis25::class.java)
            startActivity(intent)
        }

        button26.setOnClickListener {
            val intent = Intent(this,Mayis26::class.java)
            startActivity(intent)
        }

        button27.setOnClickListener {
            val intent = Intent(this,Mayis27::class.java)
            startActivity(intent)
        }

        button28.setOnClickListener {
            val intent = Intent(this,Mayis28::class.java)
            startActivity(intent)
        }

        button29.setOnClickListener {
            val intent = Intent(this,Mayis29::class.java)
            startActivity(intent)
        }

        button30.setOnClickListener {
            val intent = Intent(this,Mayis30::class.java)
            startActivity(intent)
        }

        button31.setOnClickListener {
            val intent = Intent(this,Mayis31::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
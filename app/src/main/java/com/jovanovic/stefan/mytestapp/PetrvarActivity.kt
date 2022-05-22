package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.petrvar.*
import kotlinx.android.synthetic.main.activity_petrvar.*

class PetrvarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_petrvar)
        val actionbar = supportActionBar
        actionbar!!.title = "Փետրվար"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))
        button1.setOnClickListener {
            val intent = Intent(this, Petrvar1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,Petrvar2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,Petrvar3::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,Petrvar4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,Petrvar5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this,Petrvar6::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this,Petrvar7::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this,Petrvar8::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(this,Petrvar9::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(this,Petrvar10::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(this,Petrvar11::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this,Petrvar12::class.java)
            startActivity(intent)
        }

        button13.setOnClickListener {
            val intent = Intent(this,Petrvar13::class.java)
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(this,Petrvar14::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(this,Petrvar15::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(this,Petrvar16::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            val intent = Intent(this,Petrvar17::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(this,Petrvar18::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this,Petrvar19::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(this,Petrvar20::class.java)
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(this,Petrvar21::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this,Petrvar22::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this,Petrvar23::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(this,Petrvar24::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(this,Petrvar25::class.java)
            startActivity(intent)
        }

        button26.setOnClickListener {
            val intent = Intent(this,Petrvar26::class.java)
            startActivity(intent)
        }

        button27.setOnClickListener {
            val intent = Intent(this,Petrvar27::class.java)
            startActivity(intent)
        }

        button28.setOnClickListener {
            val intent = Intent(this,Petrvar28::class.java)
            startActivity(intent)
        }



    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
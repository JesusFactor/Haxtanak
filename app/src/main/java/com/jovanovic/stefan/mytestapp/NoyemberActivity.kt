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
        button1.setOnClickListener {
            val intent = Intent(this, Noy1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,Noy2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,Noy3::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,Noy4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,Noy5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this,Noy6::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this,Noy7::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this,Noy8::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(this,Noy9::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(this,Noy10::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(this,Noy11::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this,Noy12::class.java)
            startActivity(intent)
        }

        button13.setOnClickListener {
            val intent = Intent(this,Noy13::class.java)
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(this,Noy14::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(this,Noy15::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(this,Noy16::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            val intent = Intent(this,Noy17::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(this,Noy18::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this,Noy19::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(this,Noy20::class.java)
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(this,Noy21::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this,Noy22::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this,Noy23::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(this,Noy24::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(this,Noy25::class.java)
            startActivity(intent)
        }

        button26.setOnClickListener {
            val intent = Intent(this,Noy26::class.java)
            startActivity(intent)
        }

        button27.setOnClickListener {
            val intent = Intent(this,Noy27::class.java)
            startActivity(intent)
        }

        button28.setOnClickListener {
            val intent = Intent(this,Noy28::class.java)
            startActivity(intent)
        }

        button29.setOnClickListener {
            val intent = Intent(this,Noy29::class.java)
            startActivity(intent)
        }

        button30.setOnClickListener {
            val intent = Intent(this,Noy30::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
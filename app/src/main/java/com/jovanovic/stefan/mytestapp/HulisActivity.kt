package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.april.Hulis9
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
        button1.setOnClickListener {
            val intent = Intent(this, Hulis1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,Hulis2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,Hulis3::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,Hulis4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,Hulis5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this,Hulis6::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this,Hulis7::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this,Hulis8::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(this,Hulis9::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(this,Hulis10::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(this,Hulis11::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this,Hulis12::class.java)
            startActivity(intent)
        }

        button13.setOnClickListener {
            val intent = Intent(this,Hulis13::class.java)
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(this,Hulis14::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(this,Hulis15::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(this,Hulis16::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            val intent = Intent(this,Hulis17::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(this,Hulis18::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this,Hulis19::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(this,Hulis20::class.java)
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(this,Hulis21::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this,Hulis22::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this,Hulis23::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(this,Hulis24::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(this,Hulis25::class.java)
            startActivity(intent)
        }

        button26.setOnClickListener {
            val intent = Intent(this,Hulis26::class.java)
            startActivity(intent)
        }

        button27.setOnClickListener {
            val intent = Intent(this,Hulis27::class.java)
            startActivity(intent)
        }

        button28.setOnClickListener {
            val intent = Intent(this,Hulis28::class.java)
            startActivity(intent)
        }

        button29.setOnClickListener {
            val intent = Intent(this,Hulis29::class.java)
            startActivity(intent)
        }

        button30.setOnClickListener {
            val intent = Intent(this,Hulis30::class.java)
            startActivity(intent)
        }

        button31.setOnClickListener {
            val intent = Intent(this,Hulis31::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
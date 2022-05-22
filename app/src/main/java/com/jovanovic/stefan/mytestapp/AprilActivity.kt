package com.jovanovic.stefan.mytestapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jovanovic.stefan.mytestapp.april.*
import kotlinx.android.synthetic.main.activity_april.*

class AprilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_april)
        val actionbar = supportActionBar
        actionbar!!.title = "Ապրիլ"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))
        button1.setOnClickListener {
            val intent = Intent(this, April1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this,April2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this,April3::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this,April4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,April5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this,April6::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this,April7::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this,April8::class.java)
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(this,April9::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(this,April10::class.java)
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent(this,April11::class.java)
            startActivity(intent)
        }

        button12.setOnClickListener {
            val intent = Intent(this,April12::class.java)
            startActivity(intent)
        }

        button13.setOnClickListener {
            val intent = Intent(this,April13::class.java)
            startActivity(intent)
        }

        button14.setOnClickListener {
            val intent = Intent(this,April14::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(this,April15::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(this,April16::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            val intent = Intent(this,April17::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(this,April18::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this,April19::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(this,April20::class.java)
            startActivity(intent)
        }

        button21.setOnClickListener {
            val intent = Intent(this,April21::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this,April22::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this,April23::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(this,April24::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent(this,April25::class.java)
            startActivity(intent)
        }

        button26.setOnClickListener {
            val intent = Intent(this,April26::class.java)
            startActivity(intent)
        }

        button27.setOnClickListener {
            val intent = Intent(this,April27::class.java)
            startActivity(intent)
        }

        button28.setOnClickListener {
            val intent = Intent(this,April28::class.java)
            startActivity(intent)
        }

        button29.setOnClickListener {
            val intent = Intent(this,April29::class.java)
            startActivity(intent)
        }

        button30.setOnClickListener {
            val intent = Intent(this,April30::class.java)
            startActivity(intent)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
package com.jovanovic.stefan.mytestapp.days_words
    import android.graphics.Color
    import android.graphics.drawable.ColorDrawable
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import com.jovanovic.stefan.mytestapp.R

    class DektemberDay4Word3 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_dektember_day4_word3)
            val actionbar = supportActionBar
            actionbar!!.title = "Նեեմիա 1-3  "

            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        }

        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
    }
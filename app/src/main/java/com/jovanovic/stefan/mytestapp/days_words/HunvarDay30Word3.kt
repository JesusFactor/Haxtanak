package com.jovanovic.stefan.mytestapp.days_words
    import android.graphics.Color
    import android.graphics.drawable.ColorDrawable
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import com.jovanovic.stefan.mytestapp.R

    class HunvarDay30Word3 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_hunvar_day30_word3)
            val actionbar = supportActionBar
            actionbar!!.title = "Ելից 9-10  "

            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00d9ff")))

        }

        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
    }

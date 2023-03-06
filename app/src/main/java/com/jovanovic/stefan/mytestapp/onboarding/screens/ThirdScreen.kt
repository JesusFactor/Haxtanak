package com.jovanovic.stefan.mytestapp.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.jovanovic.stefan.mytestapp.R
import com.tapadoo.alerter.Alerter
import kotlinx.android.synthetic.main.fragment_first_screen.view.*
import kotlinx.android.synthetic.main.fragment_splash.*
import kotlinx.android.synthetic.main.fragment_third_screen.view.*

class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_screen, container, false)
        val ttb = AnimationUtils.loadAnimation(activity,R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(activity,R.anim.stb)
        val btn = AnimationUtils.loadAnimation(activity,R.anim.button_animation)
        val imageView3 = view.findViewById<ImageView>(R.id.imageView3) as ImageView
        val description3 = view.findViewById<TextView>(R.id.description3) as TextView
        val finish = view.findViewById<TextView>(R.id.finish) as TextView
        imageView3.startAnimation(ttb)
        //title3.startAnimation(stb)
        description3.startAnimation(stb)
        finish.startAnimation(stb)


        view.finish.setOnClickListener {
            view.finish.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction{
                Alerter.Companion.create(activity)
                    .setTitle("Հաղթանակի Ծրագիր")
                    .setText("Բարի Գալուստ")
                    .setIcon(R.drawable.icon)
                    .setBackgroundColorRes(android.R.color.holo_blue_bright)
                    .setDuration(2500)
                    .setOnClickListener(View.OnClickListener {
                        Alerter.hide()
                    })
                    .show()
                findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
                onBoardingFinished()
            }

        }
        return view
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}
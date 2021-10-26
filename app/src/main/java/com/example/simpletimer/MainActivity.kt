package com.example.simpletimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        object : CountDownTimer(10000, 1000) {
            override fun onTick(p0: Long) {

                tv_timer.text = "Timer : ${p0 / 1000}"
            }

            override fun onFinish() {
                tv_timer.text = "Timer : 0 "
                Toast.makeText(applicationContext, "Timer is OFF", Toast.LENGTH_SHORT).show()

            }

        }.start()

    }
}
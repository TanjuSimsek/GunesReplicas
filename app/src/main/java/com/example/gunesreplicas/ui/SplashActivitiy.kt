package com.example.gunesreplicas.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.gunesreplicas.R
import com.example.gunesreplicas.util.extStartActivity

class SplashActivitiy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {

                this@SplashActivitiy extStartActivity DashboardActivity::class.java


            }

            override fun onTick(millisUntilFinished: Long) {


            }


        }.start()
    }
}

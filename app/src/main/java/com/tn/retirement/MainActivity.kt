package com.tn.retirement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        AppCenter.start(application, "2def0642-9a36-48ba-a496-2660f226e413",
                Analytics::class.java, Analytics::class.java)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

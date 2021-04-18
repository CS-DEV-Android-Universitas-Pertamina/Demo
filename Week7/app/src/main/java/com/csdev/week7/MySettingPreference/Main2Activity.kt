package com.csdev.week7.MySettingPreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.csdev.week7.R

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportFragmentManager.beginTransaction().add(R.id.setting_holder, MyPreferenceFragment()).commit()
    }
}
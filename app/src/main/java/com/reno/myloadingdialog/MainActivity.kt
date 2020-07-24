package com.reno.myloadingdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = LoadingDialog(this)
        dialog.setTime(5 * 1000)
        dialog.show()
    }
}
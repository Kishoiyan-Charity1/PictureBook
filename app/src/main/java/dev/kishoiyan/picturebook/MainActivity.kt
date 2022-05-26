package dev.kishoiyan.picturebook

import android.content.Intent
import android.media.tv.TvContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this,CarActivity ::class.java)
            startActivity(intent)

        }


    }
}
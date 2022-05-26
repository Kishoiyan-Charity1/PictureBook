package dev.kishoiyan.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TravelActivity : AppCompatActivity() {
    lateinit var btnPrev4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        btnPrev4= findViewById(R.id.btnPrev4)
        btnPrev4.setOnClickListener{
            val intent = Intent( this,HouseActivity ::class.java)
            startActivity(intent)
        }
    }
}
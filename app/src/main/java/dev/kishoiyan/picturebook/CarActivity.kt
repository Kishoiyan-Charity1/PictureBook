package dev.kishoiyan.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CarActivity : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnPrev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)
        btnNext2= findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent = Intent( this,HouseActivity :: class.java)
            startActivity(intent)
        }
        btnPrev= findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener{
            val intent = Intent (this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}
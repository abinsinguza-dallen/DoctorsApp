package com.misky.chattingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.misky.chattingapplication.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity() {
    lateinit var binding:ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

 binding.btndentists.setOnClickListener {
     val intent=Intent(this,Dentists::class.java)
     startActivity(intent)
 }
        binding.btneyes.setOnClickListener {
            val intent=Intent(this,Martanity::class.java)
            startActivity(intent)
        }
        binding.btnmaternity.setOnClickListener {
            val intent=Intent(this,EyesDoctors::class.java)
            startActivity(intent)
        }


    }
}
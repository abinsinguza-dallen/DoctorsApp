package com.misky.chattingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.misky.chattingapplication.databinding.ActivityLoginAcctivityBinding

class LoginAcctivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginAcctivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginAcctivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding. tvsign.setOnClickListener {
            val intent=Intent(this,SignUp::class.java )
            startActivity(intent)
        }
        binding.btnlogin.setOnClickListener {
            val intent=Intent(this,AboutUs::class.java)
            startActivity(intent)
        }
    }
}
package com.misky.chattingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.misky.chattingapplication.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvlogins.setOnClickListener {
            val intent=Intent(this, LoginAcctivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            val intent=Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

    }
}
package com.misky.chattingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.misky.chattingapplication.databinding.ActivityViewDoctorsBinding
import com.squareup.picasso.Picasso

class ViewDoctorsActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewDoctorsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewDoctorsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras() {
        val extras = intent.extras
        var name = extras?.getString("NAME", "")
        var phone = extras?.getString("PHONENUMBER", "")
        var email = extras?.getString("EMAIL", "")
        var address = extras?.getString("LOCATION", "")
        var image = binding.imgperson

        Toast.makeText(this,name, Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone, Toast.LENGTH_LONG).show()
        binding.tvname1.text=name
        binding.tvphoneNumber.text=phone
        binding.tvEmaill.text=email
        binding.tvLocation.text=address
        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .resize(600,600)
            .centerCrop()
            .into(image)
    }
}
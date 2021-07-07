package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson :Person = Person("Ali", "123456", "ali@gmail.com", "123 Jalan ABC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView( this, R.layout.activity_main)

        binding.personData = aPerson
//        binding.tvName.text = aPerson.name
//        binding.tvIC.text = aPerson.ic
//        binding.tvEmail.text = aPerson.email
//        binding.tvAddress.text = aPerson.address

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "abu@gmail.com"
            aPerson.address = "Jalan 123"
            binding.apply { invalidateAll() }
        }
    }



}
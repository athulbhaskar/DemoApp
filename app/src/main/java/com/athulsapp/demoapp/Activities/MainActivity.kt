package com.athulsapp.demoapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.athulsapp.demoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.button2.setOnClickListener {

           val usename=binding.username.text
            val password=binding.username.text





        }



    }
}
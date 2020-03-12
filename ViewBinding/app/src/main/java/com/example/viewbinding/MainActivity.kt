package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var isFragmentShown = false

        val myFragment = MyFragment()

        supportFragmentManager.beginTransaction().add(R.id.frame_layout, myFragment).hide(myFragment).commit()

        binding.buttonHideShowFragment.setOnClickListener {
            if(isFragmentShown){
                supportFragmentManager.beginTransaction().hide(myFragment).commit()
                isFragmentShown = false
            }
            else{
                supportFragmentManager.beginTransaction().show(myFragment).commit()
                isFragmentShown = true
            }
        }
    }
}

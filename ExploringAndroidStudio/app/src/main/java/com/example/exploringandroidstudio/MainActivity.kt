package com.example.exploringandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        var counter = 0

        button.setOnClickListener(View.OnClickListener {
            textView.text = "You've clicked the button ${++counter} times!"
            if (counter >= 10) {
                counter = 0
            }
        })

    }
}

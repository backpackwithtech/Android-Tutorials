package com.example.viewbinding

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbinding.databinding.FragmentMyBinding
import java.util.*


class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMyBinding.inflate(inflater)

        val random = Random()

        binding.buttonChangeColor.setOnClickListener {
            binding.root.setBackgroundColor(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)))
        }

        return binding.root
    }

}

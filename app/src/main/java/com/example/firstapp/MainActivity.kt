package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.firstapp.databinding.MainWindowBinding
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.FirstApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: MainWindowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    Override fun onStart(){
        binding.buttonCalculate.setOnClickListener {
            val number = binding.editTextNumber.text.toString().toInt()
            val result = 1
            for (i in 2..number) {
                result *= i
            }
            binding.textViewResult.text = "Factorielle : " + result
        }
    }
}
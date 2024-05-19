package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val num1 =binding.numEditText.text
        val num2 =binding.num2EditText.text

        //bila button tambah ditekan, lakukan kod di dlm ini
        binding.plusBtn.setOnClickListener {
            val sum = num1.toString().toDouble() + num2.toString().toDouble()
            binding.resultTextView.text = "The Sum of $num1 and $num2 is $sum"

        }
        //bila button tolak ditekan, lakukan kod di dlm ini
        binding.minusBtn.setOnClickListener {
            val minus = num1.toString().toDouble() - num2.toString().toDouble()
            binding.resultTextView.text = "The Minus of $num1 and $num2 is $minus"

        }
        binding.productBtn.setOnClickListener {
            val product = num1.toString().toDouble() * num2.toString().toDouble()
            binding.resultTextView.text = "The Product of $num1 and $num2 is $product"

        }
        binding.devideBtn.setOnClickListener {
            val devide = num1.toString().toDouble() / num2.toString().toDouble()
            binding.resultTextView.text = "The Sum of $num1 and $num2 is $devide"

        }
    }
}
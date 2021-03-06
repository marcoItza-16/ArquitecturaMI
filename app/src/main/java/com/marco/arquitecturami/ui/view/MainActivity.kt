package com.marco.arquitecturami.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.marco.arquitecturami.databinding.ActivityMainBinding
import com.marco.arquitecturami.ui.viewmodel.QuoteViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val quoteViewModel : QuoteViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->

            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author

        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }
}
package com.example.pokemoncardsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pokemoncardsapp.R
import com.example.pokemoncardsapp.databinding.ActivityMainBinding
import com.example.pokemoncardsapp.view.adapter.PokemonAdapter
import com.example.pokemoncardsapp.viewmodel.PokemonViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pokemonViewModel: PokemonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pokemonViewModel = ViewModelProvider(this).get(PokemonViewModel::class.java)
        binding.rvpokemon.layoutManager = GridLayoutManager(applicationContext, 2)
        pokemonViewModel.pokemonList().observe(this, Observer{
            binding.rvpokemon.adapter = PokemonAdapter(it)
        })
    }
}
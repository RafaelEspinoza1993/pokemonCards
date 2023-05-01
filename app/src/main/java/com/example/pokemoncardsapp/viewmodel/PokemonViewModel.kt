package com.example.pokemoncardsapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.pokemoncardsapp.apirest.response.Data
import com.example.pokemoncardsapp.repository.PokemonRepository

class PokemonViewModel : ViewModel() {
    private  var repository = PokemonRepository()

    fun pokemonList(): LiveData<List<Data>>{
        return repository.pokemonList()
    }
}
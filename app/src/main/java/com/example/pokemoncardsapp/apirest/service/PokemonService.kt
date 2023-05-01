package com.example.pokemoncardsapp.apirest.service

import com.example.pokemoncardsapp.apirest.response.PokemonResult
import retrofit2.Call
import retrofit2.http.GET

interface PokemonService {


    @GET("cards?page=1&pageSize=20")
    fun pokemonList(): Call<PokemonResult>
}
package com.example.pokemoncardsapp.repository

import androidx.lifecycle.MutableLiveData
import com.example.pokemoncardsapp.apirest.RetrofitClient
import com.example.pokemoncardsapp.apirest.response.Data
import com.example.pokemoncardsapp.apirest.response.PokemonResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonRepository {
    var result = MutableLiveData<List<Data>>()

    fun pokemonList(): MutableLiveData<List<Data>>{
        val call : Call<PokemonResult> = RetrofitClient.retrofitService.pokemonList()
        call.enqueue(object : Callback<PokemonResult>{
            override fun onResponse(call: Call<PokemonResult>, response: Response<PokemonResult>) {
                result.value = response.body()!!.data
            }

            override fun onFailure(call: Call<PokemonResult>, t: Throwable) {

            }

        })

        return result
    }
}
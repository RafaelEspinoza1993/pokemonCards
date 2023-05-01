package com.example.pokemoncardsapp.apirest

import com.example.pokemoncardsapp.apirest.service.PokemonService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val apiKey = "ac323026-a20f-4ed6-a080-ae052d9b3e74"
    private val client = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val newRequest = chain.request().newBuilder()
                .addHeader("api-key", apiKey)
                .build()
            chain.proceed(newRequest)
        }
        .build()

    private fun builderRetrofit() = Retrofit.Builder()
        .baseUrl("https://api.pokemontcg.io/v2/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofitService: PokemonService by lazy {
        builderRetrofit().create(PokemonService::class.java)
    }
}
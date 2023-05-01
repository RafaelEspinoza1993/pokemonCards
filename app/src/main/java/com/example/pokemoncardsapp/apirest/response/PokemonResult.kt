package com.example.pokemoncardsapp.apirest.response

data class PokemonResult(
    val count: Int,
    val data: List<Data>,
    val page: Int,
    val pageSize: Int,
    val totalCount: Int
)
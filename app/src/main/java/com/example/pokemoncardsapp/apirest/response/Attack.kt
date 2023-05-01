package com.example.pokemoncardsapp.apirest.response

data class Attack(
    val convertedEnergyCost: Int,
    val cost: List<String>,
    val damage: String,
    val name: String,
    val text: String
)
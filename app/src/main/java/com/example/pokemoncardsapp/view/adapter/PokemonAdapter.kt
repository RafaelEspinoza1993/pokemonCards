package com.example.pokemoncardsapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemoncardsapp.apirest.response.Data
import com.example.pokemoncardsapp.databinding.PokemonItemBinding

class PokemonAdapter(private val listPokemon : List<Data>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: PokemonItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PokemonItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonAdapter.ViewHolder, position: Int) {
        with(holder){
            with(listPokemon[position]){
                binding.pkmname.text = name
                binding.pkmtype.text = types[0]
            }
        }
    }

    override fun getItemCount() = listPokemon.size

}
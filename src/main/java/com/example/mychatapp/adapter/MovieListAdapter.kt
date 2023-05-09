package com.example.mychatapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mychatapp.databinding.CustomListViewBinding
import com.example.mychatapp.model.Movie

class MovieListAdapter(var context:Context, var movieList : MutableList<Movie>): RecyclerView.Adapter<MovieListAdapter.MyViewHolder>(){

    class MyViewHolder(var bind: CustomListViewBinding) : RecyclerView.ViewHolder(bind.root)
    lateinit var binding: CustomListViewBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = CustomListViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movieList[position]
        holder.bind.tvTitle.text = movie.movieName
        holder.bind.tvCategory.text = movie.category
        holder.bind.tvYear.text = "${movie.year}"
        holder.bind.imageView.setImageResource(movie.image)
        holder.bind.ratingBar.rating = movie.rating

        holder.bind.listCardView.setOnClickListener {
            Toast.makeText(context, movie.movieName, Toast.LENGTH_SHORT).show()
        }

    }
}


package com.example.mychatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mychatapp.adapter.MovieListAdapter
import com.example.mychatapp.databinding.ActivityMainBinding
import com.example.mychatapp.model.Movie

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var movieList = mutableListOf<Movie>()
    lateinit var mAdapter: MovieListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        movieList.add(Movie(1,"KGF Chapter 2","Action, Drama",4.7f,2022,R.drawable.image_1))
        movieList.add(Movie(2,"Pathaan","Action, Thriller",3.9f,2023,R.drawable.image_2))
        movieList.add(Movie(3,"Black Panther : Wakanda Forever","Action, Adventure",4.0f,2022,R.drawable.image_3))
        movieList.add(Movie(4,"Mission Majnu","Action, Thriller",4.5f,2023,R.drawable.image_4))
        movieList.add(Movie(5,"Major","Action, Drama",4.7f,2022,R.drawable.image_5))
        movieList.add(Movie(6,"Varisu","Action, Drama",4.1f,2023,R.drawable.image_6))

        mAdapter = MovieListAdapter(this,movieList)
        binding.recyclerShow.layoutManager = LinearLayoutManager(this)
        binding.recyclerShow.adapter = mAdapter
    }
}
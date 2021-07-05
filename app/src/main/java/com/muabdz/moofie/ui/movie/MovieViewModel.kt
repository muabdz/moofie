package com.muabdz.moofie.ui.movie

import androidx.lifecycle.ViewModel
import com.muabdz.moofie.data.MovieEntity
import com.muabdz.moofie.utils.DummyData

class MovieViewModel: ViewModel() {
    fun getMovies(): List<MovieEntity> = DummyData.generateDummyMovies()
}
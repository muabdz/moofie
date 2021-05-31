package com.muabdz.moofie.ui.detail

import androidx.lifecycle.ViewModel
import com.muabdz.moofie.data.MovieEntity
import com.muabdz.moofie.utils.DummyData

class MovieDetailViewModel: ViewModel() {

    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie() : MovieEntity {
        lateinit var movie: MovieEntity
        val movieEntities = DummyData.generateDummyMovies()
        for (movieEntity in movieEntities) {
            if (movieEntity.id == movieId) {
                movie = movieEntity
                break
            }
        }
        return movie
    }
}
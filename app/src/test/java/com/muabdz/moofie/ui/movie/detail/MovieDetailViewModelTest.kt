package com.muabdz.moofie.ui.movie.detail

import com.muabdz.moofie.utils.DummyData
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MovieDetailViewModelTest {

    private lateinit var viewModel: MovieDetailViewModel
    private val dummyMovie = DummyData.generateDummyMovies()[0]
    private val movieId = dummyMovie.movieId

    @Before
    fun setUp() {
        viewModel = MovieDetailViewModel()
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val entity = viewModel.getMovie()
        assertNotNull(entity)
        assertEquals(dummyMovie.movieId, entity.movieId)
        assertEquals(dummyMovie.imageDrawable, entity.imageDrawable)
        assertEquals(dummyMovie.description, entity.description)
        assertEquals(dummyMovie.duration, entity.duration)
        assertEquals(dummyMovie.userScore, entity.userScore)
        assertEquals(dummyMovie.genre, entity.genre)
        assertEquals(dummyMovie.releaseDate, entity.releaseDate)
        assertEquals(dummyMovie.title, entity.title)
        assertEquals(dummyMovie.rating, entity.rating)
    }
}
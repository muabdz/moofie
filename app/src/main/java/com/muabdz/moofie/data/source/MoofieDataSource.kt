package com.muabdz.moofie.data.source

import androidx.lifecycle.LiveData
import com.muabdz.moofie.data.MovieEntity
import com.muabdz.moofie.data.TvShowEntity

interface MoofieDataSource {

    fun getMovieGenreList(): LiveData<HashMap<Int, String>>

    fun getTvShowGenreList(): LiveData<HashMap<Int, String>>

    fun getMovieList(): LiveData<List<MovieEntity>>

    fun getTvShowList(): LiveData<List<TvShowEntity>>

    fun getMovieDetail(movieId: String): LiveData<MovieEntity>

    fun getTvShowDetail(tvShowId: String): LiveData<TvShowEntity>
}
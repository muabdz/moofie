package com.muabdz.moofie.data.source.remote

import com.muabdz.moofie.data.source.remote.response.GenreListResponse
import com.muabdz.moofie.data.source.remote.response.movie.MovieDetailResponse
import com.muabdz.moofie.data.source.remote.response.movie.MovieListResponse
import com.muabdz.moofie.data.source.remote.response.tvshow.TvShowDetailResponse
import com.muabdz.moofie.data.source.remote.response.tvshow.TvShowListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    companion object {
        // TODO: 11/07/2021 remove API key on push
        const val QUERY_API_KEY = "?api_key=c33b2acedf52d6016caf3dbbe3d718da"
    }

    @GET("/genre/movie/list$QUERY_API_KEY")
    fun getMovieGenreList(): Call<GenreListResponse>

    @GET("/genre/tv/list$QUERY_API_KEY")
    fun getTvShowGenreList(): Call<GenreListResponse>

    @GET("/discover/movie$QUERY_API_KEY")
    fun getMovieList(): Call<MovieListResponse>

    @GET("/discover/tv$QUERY_API_KEY")
    fun getTvShowList(): Call<TvShowListResponse>

    @GET("/movie/{movie_id}")
    fun getMovieDetail(@Path("movie_id") movieId: String): Call<MovieDetailResponse>

    @GET("/tv/{tv_id}")
    fun getTvShowDetail(@Path("tv_id") tvShowId: String): Call<TvShowDetailResponse>
}
package com.muabdz.moofie.data.source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.muabdz.moofie.BuildConfig
import com.muabdz.moofie.data.MovieEntity
import com.muabdz.moofie.data.SeasonEntity
import com.muabdz.moofie.data.TvShowEntity
import com.muabdz.moofie.data.source.remote.ApiConfig
import com.muabdz.moofie.data.source.remote.response.GenreListResponse
import com.muabdz.moofie.data.source.remote.response.movie.MovieDetailResponse
import com.muabdz.moofie.data.source.remote.response.movie.MovieListResponse
import com.muabdz.moofie.data.source.remote.response.tvshow.TvShowDetailResponse
import com.muabdz.moofie.data.source.remote.response.tvshow.TvShowListResponse
import com.muabdz.moofie.utils.TimeUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoofieRepository: MoofieDataSource {

    companion object {

        @Volatile
        private var instance: MoofieRepository? = null

        fun getInstance(): MoofieRepository =
            instance ?: synchronized(this) {
                instance ?: MoofieRepository().apply { instance = this }
            }
    }

    override fun getMovieGenreList(): LiveData<HashMap<Int, String>> {
        val movieGenres = MutableLiveData<HashMap<Int, String>>()
        val client = ApiConfig.getApiService().getMovieGenreList()
        client.enqueue(object : Callback<GenreListResponse> {
            override fun onResponse(
                call: Call<GenreListResponse>,
                response: Response<GenreListResponse>
            ) {
                val genreHashMap = hashMapOf<Int, String>()
                if (response.isSuccessful) {
                    val genres = response.body()?.genres
                    if (!genres.isNullOrEmpty()) {
                        for (genre in genres) {
                            genreHashMap[genre.id] = genre.name
                        }
                        movieGenres.postValue(genreHashMap)
                    }
                } else {
                    Log.e("movieGenreList", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<GenreListResponse>, t: Throwable) {
                Log.e("movieGenreList", "onFailure: ${t.message}")
            }

        })
        return movieGenres
    }

    override fun getTvShowGenreList(): LiveData<HashMap<Int, String>> {
        val tvShowGenres = MutableLiveData<HashMap<Int, String>>()
        val client = ApiConfig.getApiService().getTvShowGenreList()
        client.enqueue(object : Callback<GenreListResponse> {
            override fun onResponse(
                call: Call<GenreListResponse>,
                response: Response<GenreListResponse>
            ) {
                if (response.isSuccessful) {
                    val genreHashMap = hashMapOf<Int, String>()
                    val genres = response.body()?.genres
                    if (!genres.isNullOrEmpty()) {
                        for (genre in genres) {
                            genreHashMap[genre.id] = genre.name
                        }
                        tvShowGenres.postValue(genreHashMap)
                    }
                } else {
                    Log.e("tvShowGenreList", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<GenreListResponse>, t: Throwable) {
                Log.e("tvShowGenreList", "onFailure: ${t.message}")
            }

        })
        return tvShowGenres
    }

    override fun getMovieList(): LiveData<List<MovieEntity>> {
        val movieListResult = MutableLiveData<List<MovieEntity>>()
        val client = ApiConfig.getApiService().getMovieList()
        client.enqueue(object : Callback<MovieListResponse> {
            override fun onResponse(
                call: Call<MovieListResponse>,
                response: Response<MovieListResponse>
            ) {
                if (response.isSuccessful) {
                    val movieList = ArrayList<MovieEntity>()
                    val movies = response.body()?.results
                    if (!movies.isNullOrEmpty()) {
                        for (movie in movies) {
                            val movieEntity = MovieEntity(
                                movie.id.toString(),
                                movie.title,
                                movie.overview,
                                movie.releaseDate,
                                movie.originalLanguage,
                                movie.voteAverage.toInt(),
                                "",
                                TimeUtils.getTimeFromMinutes(movie.runtime),
                                "${BuildConfig.IMAGE_URL}${movie.posterPath}"
                            )
                            movieList.add(movieEntity)
                        }
                        movieListResult.postValue(movieList)
                    }
                } else {
                    Log.e("movieList", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                Log.e("movieList", "onFailure: ${t.message}")
            }

        })
        return movieListResult
    }

    override fun getTvShowList(): LiveData<List<TvShowEntity>> {
        val tvShowListResult = MutableLiveData<List<TvShowEntity>>()
        val client = ApiConfig.getApiService().getTvShowList()
        client.enqueue(object : Callback<TvShowListResponse> {
            override fun onResponse(
                call: Call<TvShowListResponse>,
                response: Response<TvShowListResponse>
            ) {
                if (response.isSuccessful) {
                    val tvShowList = ArrayList<TvShowEntity>()
                    val tvShows = response.body()?.results
                    if (!tvShows.isNullOrEmpty()) {
                        for (tvShow in tvShows) {
                            val seasonsResult = ArrayList<SeasonEntity>()
                            if (!tvShow.seasons.isNullOrEmpty()) {
                                for (season in tvShow.seasons!!) {
                                    val seasonResult = SeasonEntity(
                                        season.id.toString(),
                                        tvShow.id.toString(),
                                        season.name,
                                        season.episodeCount
                                    )
                                    seasonsResult.add(seasonResult)
                                }
                            }
                            val tvShowEntity = TvShowEntity(
                                tvShow.id.toString(),
                                tvShow.name,
                                tvShow.overview,
                                tvShow.firstAirDate,
                                tvShow.voteAverage.toInt(),
                                "",
                                "${BuildConfig.IMAGE_URL}${tvShow.posterPath}",
                                seasonsResult
                            )
                            tvShowList.add(tvShowEntity)
                        }
                        tvShowListResult.postValue(tvShowList)
                    }
                } else {
                    Log.e("tvShowList", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<TvShowListResponse>, t: Throwable) {
                Log.e("tvShowList", "onFailure: ${t.message}")
            }
        })
        return tvShowListResult
    }

    override fun getMovieDetail(movieId: String): LiveData<MovieEntity> {
        val movieResult = MutableLiveData<MovieEntity>()
        val client = ApiConfig.getApiService().getMovieDetail(movieId)
        client.enqueue(object : Callback<MovieDetailResponse> {
            override fun onResponse(
                call: Call<MovieDetailResponse>,
                response: Response<MovieDetailResponse>
            ) {
                if (response.isSuccessful) {
                    val movie = response.body()
                    if (movie != null) {
                        val movieEntity = MovieEntity(
                            movie.id.toString(),
                            movie.title,
                            movie.overview,
                            movie.releaseDate,
                            movie.originalLanguage,
                            movie.voteAverage.toInt(),
                            "",
                            TimeUtils.getTimeFromMinutes(movie.runtime),
                            "${BuildConfig.IMAGE_URL}${movie.posterPath}"
                        )
                        movieResult.postValue(movieEntity)
                    }
                } else {
                    Log.e("movieDetail", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<MovieDetailResponse>, t: Throwable) {
                Log.e("movieDetail", "onFailure: ${t.message}")
            }
        })
        return movieResult
    }

    override fun getTvShowDetail(tvShowId: String): LiveData<TvShowEntity> {
        val tvShowResult = MutableLiveData<TvShowEntity>()
        val client = ApiConfig.getApiService().getTvShowDetail(tvShowId)
        client.enqueue(object : Callback<TvShowDetailResponse> {
            override fun onResponse(
                call: Call<TvShowDetailResponse>,
                response: Response<TvShowDetailResponse>
            ) {
                if (response.isSuccessful) {
                    val tvShow = response.body()
                    if (tvShow != null) {
                        val seasonsResult = ArrayList<SeasonEntity>()
                        if (!tvShow.seasons.isNullOrEmpty()) {
                            for (season in tvShow.seasons!!) {
                                val seasonResult = SeasonEntity(
                                    season.id.toString(),
                                    tvShow.id.toString(),
                                    season.name,
                                    season.episodeCount
                                )
                                seasonsResult.add(seasonResult)
                            }
                        }
                        val tvShowEntity = TvShowEntity(
                            tvShow.id.toString(),
                            tvShow.name,
                            tvShow.overview,
                            tvShow.firstAirDate,
                            tvShow.voteAverage.toInt(),
                            "",
                            "${BuildConfig.IMAGE_URL}${tvShow.posterPath}",
                            seasonsResult
                        )
                        tvShowResult.postValue(tvShowEntity)
                    }
                } else {
                    Log.e("tvShowDetail", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<TvShowDetailResponse>, t: Throwable) {
                Log.e("tvShowDetail", "onFailure: ${t.message}")
            }
        })
        return tvShowResult
    }
}
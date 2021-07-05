package com.muabdz.moofie.ui.movie.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.muabdz.moofie.R
import com.muabdz.moofie.data.MovieEntity
import com.muabdz.moofie.databinding.ActivityMovieDetailBinding

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var movieDetailBinding: ActivityMovieDetailBinding

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieDetailBinding = ActivityMovieDetailBinding.inflate(layoutInflater)
        setContentView(movieDetailBinding.root)

        setSupportActionBar(movieDetailBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieDetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                populateMovie(viewModel.getMovie())
            }
        }
    }

    private fun populateMovie(movieEntity: MovieEntity) {
        Glide.with(this)
            .load(movieEntity.imageDrawable)
            .transform(RoundedCorners(8))
            .apply(RequestOptions.placeholderOf(R.drawable.ic_image_loading)
                .error(R.drawable.ic_image_error))
            .into(movieDetailBinding.ivPoster)

        movieDetailBinding.tvTitle.text = movieEntity.title
        movieDetailBinding.tvDate.text = movieEntity.releaseDate
        movieDetailBinding.tvDuration.text = movieEntity.duration
        movieDetailBinding.tvRating.text = movieEntity.rating
        movieDetailBinding.tvGenre.text = movieEntity.genre
        movieDetailBinding.tvUserScore.text = movieEntity.userScore.toString()
        movieDetailBinding.tvDescription.text = movieEntity.description
    }
}
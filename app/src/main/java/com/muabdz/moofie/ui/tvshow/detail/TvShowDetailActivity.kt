package com.muabdz.moofie.ui.tvshow.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.muabdz.moofie.R
import com.muabdz.moofie.data.TvShowEntity
import com.muabdz.moofie.databinding.ActivityTvShowDetailBinding

class TvShowDetailActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityTvShowDetailBinding
    private lateinit var viewModel: TvShowDetailViewModel

    companion object {
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityTvShowDetailBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        setSupportActionBar(viewBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowDetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val tvShowId = extras.getString(EXTRA_TV_SHOW)
            if (tvShowId != null) {
                viewModel.setSelectedTvShow(tvShowId)
                populateTvShow(viewModel.getTvShow())
            }
        }
    }

    private fun populateTvShow(tvShowEntity: TvShowEntity) {
        Glide.with(this)
            .load(tvShowEntity.imageDrawable)
            .transform(RoundedCorners(8))
            .apply(RequestOptions.placeholderOf(R.drawable.ic_image_loading)
                .error(R.drawable.ic_image_error))
            .into(viewBinding.ivPoster)

        viewBinding.tvTitle.text = tvShowEntity.title
        viewBinding.tvUserScore.text = tvShowEntity.userScore.toString()
        viewBinding.tvDate.text = tvShowEntity.releaseDate
        viewBinding.tvGenre.text = tvShowEntity.genre
        viewBinding.tvDescription.text = tvShowEntity.description

        val seasonAdapter = SeasonAdapter()
        seasonAdapter.setSeasons(viewModel.getSeasons())
        with(viewBinding.rvSeasons) {
            layoutManager = LinearLayoutManager(this@TvShowDetailActivity)
            setHasFixedSize(true)
            adapter = seasonAdapter
        }
    }
}
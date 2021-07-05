package com.muabdz.moofie.ui.tvshow.detail

import androidx.lifecycle.ViewModel
import com.muabdz.moofie.data.SeasonEntity
import com.muabdz.moofie.data.TvShowEntity
import com.muabdz.moofie.utils.DummyData

class TvShowDetailViewModel: ViewModel() {

    private lateinit var tvShowId: String

    fun setSelectedTvShow(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getTvShow(): TvShowEntity {
        lateinit var tvShow: TvShowEntity
        val tvShowEntities = DummyData.generateDummyTvShows()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.tvShowId == tvShowId) {
                tvShow = tvShowEntity
                break
            }
        }
        return tvShow
    }

    fun getSeasons(): ArrayList<SeasonEntity> = DummyData.generateDummySeasons(tvShowId)
}
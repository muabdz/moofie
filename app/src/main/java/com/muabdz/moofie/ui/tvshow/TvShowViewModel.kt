package com.muabdz.moofie.ui.tvshow

import androidx.lifecycle.ViewModel
import com.muabdz.moofie.data.TvShowEntity
import com.muabdz.moofie.utils.DummyData

class TvShowViewModel: ViewModel() {
    fun getTvShows(): List<TvShowEntity> = DummyData.generateDummyTvShows()
}
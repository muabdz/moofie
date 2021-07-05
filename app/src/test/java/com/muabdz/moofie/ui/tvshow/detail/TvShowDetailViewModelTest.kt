package com.muabdz.moofie.ui.tvshow.detail

import com.muabdz.moofie.utils.DummyData
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TvShowDetailViewModelTest {

    private lateinit var viewModel: TvShowDetailViewModel
    private val dummyTvShow = DummyData.generateDummyTvShows()[0]
    private val tvShowId = dummyTvShow.tvShowId

    @Before
    fun setUp() {
        viewModel = TvShowDetailViewModel()
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedTvShow(dummyTvShow.tvShowId)
        val entity = viewModel.getTvShow()
        assertNotNull(entity)
        assertEquals(dummyTvShow.tvShowId, entity.tvShowId)
        assertEquals(dummyTvShow.imageDrawable, entity.imageDrawable)
        assertEquals(dummyTvShow.description, entity.description)
        assertEquals(dummyTvShow.genre, entity.genre)
        assertEquals(dummyTvShow.title, entity.title)
        assertEquals(dummyTvShow.userScore, entity.userScore)
        assertEquals(dummyTvShow.releaseDate, entity.releaseDate)
    }

    @Test
    fun getSeasons() {
        val seasonEntities = viewModel.getSeasons()
        assertNotNull(seasonEntities)
        assertEquals(5, seasonEntities.size)
    }
}
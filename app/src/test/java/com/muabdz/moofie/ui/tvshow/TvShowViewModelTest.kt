package com.muabdz.moofie.ui.tvshow

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getMovies() {
        val tvShowEntities = viewModel.getTvShows()
        Assert.assertNotNull(tvShowEntities)
        Assert.assertEquals(12, tvShowEntities.size)
    }
}
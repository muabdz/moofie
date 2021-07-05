package com.muabdz.moofie.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.muabdz.moofie.R
import com.muabdz.moofie.utils.DummyData
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    private val dummyMovie = DummyData.generateDummyMovies()
    private val dummyTvShow = DummyData.generateDummyTvShows()
    private val dummySeason = DummyData.generateDummySeasons(dummyTvShow[0].tvShowId)

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadMovieDetail() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.tv_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_duration)).check(matches(withText(dummyMovie[0].duration)))
        onView(withId(R.id.tv_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date)).check(matches(withText(dummyMovie[0].releaseDate)))
        onView(withId(R.id.sv_movie_detail)).perform(swipeUp())
        onView(withId(R.id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rating)).check(matches(withText(dummyMovie[0].rating)))
        onView(withId(R.id.tv_user_score)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_user_score)).check(matches(withText(dummyMovie[0].userScore.toString())))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyMovie[0].genre)))
        onView(withId(R.id.tv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description)).check(matches(withText(dummyMovie[0].description)))
    }

    @Test
    fun loadTvShows() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadTvShowDetail() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.tv_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date)).check(matches(withText(dummyTvShow[0].releaseDate)))
        onView(withId(R.id.sv_tv_show_detail)).perform(swipeUp())
        onView(withId(R.id.tv_user_score)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_user_score)).check(matches(withText(dummyTvShow[0].userScore.toString())))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyTvShow[0].genre)))
        onView(withId(R.id.tv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description)).check(matches(withText(dummyTvShow[0].description)))
        onView(withId(R.id.rv_seasons)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_seasons)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummySeason.size))
    }
}
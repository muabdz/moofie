package com.muabdz.moofie.data.source.remote.response.movie

import com.google.gson.annotations.SerializedName
import com.muabdz.moofie.data.source.remote.response.GenresItem

data class MovieDetailResponse(

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("genres")
	var genres: List<GenresItem>? = null,

	@field:SerializedName("genreIds")
	var genreIds: List<Int>? = null,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("runtime")
	var runtime: Int? = null,

	@field:SerializedName("posterPath")
	val posterPath: String,

	@field:SerializedName("releaseDate")
	val releaseDate: String,

	@field:SerializedName("voteAverage")
	val voteAverage: Double,

	@field:SerializedName("original_language")
	val originalLanguage: String
)


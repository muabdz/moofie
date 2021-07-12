package com.muabdz.moofie.data.source.remote.response.tvshow

import com.google.gson.annotations.SerializedName
import com.muabdz.moofie.data.source.remote.response.GenresItem

data class TvShowDetailResponse(

	@field:SerializedName("genres")
	var genres: List<GenresItem>? = null,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("numberOfSeasons")
	var numberOfSeasons: Int? = null,

	@field:SerializedName("firstAirDate")
	val firstAirDate: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("seasons")
	var seasons: List<SeasonsItem>? = null,

	@field:SerializedName("posterPath")
	val posterPath: String,

	@field:SerializedName("voteAverage")
	val voteAverage: Double,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("genreIds")
	var genreIds: List<Int>? = null
)





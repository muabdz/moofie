package com.muabdz.moofie.data.source.remote.response.movie

import com.google.gson.annotations.SerializedName

data class MovieListResponse(

	@field:SerializedName("results")
	val results: List<MovieDetailResponse>
)

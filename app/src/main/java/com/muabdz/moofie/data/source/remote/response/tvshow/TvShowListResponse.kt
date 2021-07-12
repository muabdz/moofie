package com.muabdz.moofie.data.source.remote.response.tvshow

import com.google.gson.annotations.SerializedName

data class TvShowListResponse(

	@field:SerializedName("results")
	val results: List<TvShowDetailResponse>
)

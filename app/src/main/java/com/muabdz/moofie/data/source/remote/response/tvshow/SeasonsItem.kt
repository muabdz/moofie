package com.muabdz.moofie.data.source.remote.response.tvshow

import com.google.gson.annotations.SerializedName

data class SeasonsItem(

	@field:SerializedName("episodeCount")
	val episodeCount: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int
)

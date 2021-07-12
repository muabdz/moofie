package com.muabdz.moofie.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class GenreListResponse(

	@field:SerializedName("genres")
	val genres: List<GenresItem>
)
package com.muabdz.moofie.data

data class MovieEntity(
    var movieId: String,
    var title: String,
    var description: String,
    var releaseDate: String,
    var rating: String,
    var userScore: Int,
    var genre: String,
    var duration: String,
    var imageDrawable: Int
)

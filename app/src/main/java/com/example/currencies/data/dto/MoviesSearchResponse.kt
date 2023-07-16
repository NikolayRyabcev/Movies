package com.example.currencies.data.dto

import com.example.currencies.domain.models.Movie

data class MoviesSearchResponse(val searchType: String,
                                val expression: String,
                                val results: List<Movie>)
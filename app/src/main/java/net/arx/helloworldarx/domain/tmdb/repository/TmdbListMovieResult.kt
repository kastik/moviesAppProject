package net.arx.helloworldarx.domain.tmdb.repository

import net.arx.helloworldarx.data.tmdb.local.LocalMovie
import net.arx.helloworldarx.data.tmdb.model.TopRatedMovieItem

sealed class TmdbListMovieResult {
    class SuccessListMovieResult(val movieDetails: List<TopRatedMovieItem>) : TmdbListMovieResult()

    class NetworkWaringResult(val movieDetails: List<TopRatedMovieItem>): TmdbListMovieResult()

    object ApiError: TmdbListMovieResult()

    object NetworkError: TmdbListMovieResult()

    object UnknownError: TmdbListMovieResult()
}

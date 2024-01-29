package net.arx.helloworldarx.ui.moviesCategory.model

sealed interface MoviesCategoryUiState {
    data object LoadingUiState : MoviesCategoryUiState
    data class DefaultUiState(val MoviesCategoryUiType: MoviesCategoryUiType) : MoviesCategoryUiState
    data object ErrorUiState : MoviesCategoryUiState
    data object EmptyUiState : MoviesCategoryUiState
}

class MoviesCategoryUiType {

}

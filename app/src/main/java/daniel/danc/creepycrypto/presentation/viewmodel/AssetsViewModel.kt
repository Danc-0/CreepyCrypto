package daniel.danc.creepycrypto.presentation.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import daniel.danc.creepycrypto.common.Resource
import daniel.danc.creepycrypto.domain.usecases.get_assets.GetAssetsUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class AssetsViewModel @Inject constructor(
    private val getAssetsUseCase: GetAssetsUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = mutableStateOf(CoinAssetsState())
    val state: State<CoinAssetsState> = _state

    init {

        getCoin()

    }

    private fun getCoin() {
        getAssetsUseCase().onEach { result ->
            when (result) {

                is Resource.Success<*> -> {
                    _state.value = CoinAssetsState(assets = result)
                }

                is Resource.Error<*> -> {
                    _state.value = CoinAssetsState(
                        error = "An unexpected error occurred"
                    )
                }

                is Resource.Loading<*> -> {
                    _state.value = CoinAssetsState(isLoading = true)

                }
            }
        }.launchIn(viewModelScope)
    }
}
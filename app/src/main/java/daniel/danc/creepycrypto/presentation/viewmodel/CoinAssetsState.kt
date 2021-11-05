package daniel.danc.creepycrypto.presentation.viewmodel

import daniel.danc.creepycrypto.domain.models.Assets.Assets

data class CoinAssetsState(
    val isLoading: Boolean = false,
    val assets: Assets? = null,
    val error: String = ""


)

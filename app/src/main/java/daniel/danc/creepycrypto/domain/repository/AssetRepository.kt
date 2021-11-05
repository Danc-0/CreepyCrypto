package daniel.danc.creepycrypto.domain.repository

import daniel.danc.creepycrypto.domain.models.Asset.Asset
import daniel.danc.creepycrypto.domain.models.AssetProfile.AssetProfile
import daniel.danc.creepycrypto.domain.models.Assets.Assets

interface AssetRepository {

    suspend fun getAssets(): Assets

    suspend fun getAssetByKey(assetKey: String): Asset

    suspend fun getAssetProfileByKey(assetKey: String): AssetProfile

}
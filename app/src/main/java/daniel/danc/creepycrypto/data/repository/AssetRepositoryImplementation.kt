package daniel.danc.creepycrypto.data.repository

import daniel.danc.creepycrypto.data.remote.MessariApi
import daniel.danc.creepycrypto.domain.models.Asset.Asset
import daniel.danc.creepycrypto.domain.models.AssetProfile.AssetProfile
import daniel.danc.creepycrypto.domain.models.Assets.Assets
import daniel.danc.creepycrypto.domain.repository.AssetRepository
import javax.inject.Inject

class AssetRepositoryImplementation @Inject constructor (private val api: MessariApi) : AssetRepository {

    override suspend fun getAssets(): Assets {
        return api.getAllAssets()
    }

    override suspend fun getAssetByKey(assetKey: String): Asset {
        return api.getAsset(assetKey)
    }

    override suspend fun getAssetProfileByKey(assetKey: String): AssetProfile {
        return api.getAssetProfile(assetKey)
    }

}
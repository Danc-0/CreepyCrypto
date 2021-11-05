package daniel.danc.creepycrypto.data.repository

import daniel.danc.creepycrypto.data.remote.MessariApi
import daniel.danc.creepycrypto.domain.models.Asset.Asset
import daniel.danc.creepycrypto.domain.models.AssetProfile.AssetProfile
import daniel.danc.creepycrypto.domain.models.Assets.Assets
import daniel.danc.creepycrypto.domain.repository.AssetRepository

class AssetRepositoryImplementation(api: MessariApi) : AssetRepository {

    override suspend fun getAssets(): Assets {
        TODO("Not yet implemented")
    }

    override suspend fun getAssetByKey(assetKey: String): Asset {
        TODO("Not yet implemented")
    }

    override suspend fun getAssetProfileByKey(assetKey: String): AssetProfile {
        TODO("Not yet implemented")
    }

}
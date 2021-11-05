package daniel.danc.creepycrypto.data.remote

import daniel.danc.creepycrypto.domain.models.Asset.Asset
import daniel.danc.creepycrypto.domain.models.AssetProfile.AssetProfile
import daniel.danc.creepycrypto.domain.models.Assets.Assets
import retrofit2.http.GET
import retrofit2.http.Query

interface MessariApi {

    @GET("api/v2/assets")
    suspend fun getAllAssets() : Assets

    @GET("api/v1/assets/{assetKey}")
    suspend fun getAsset(@Query("assetKey") assetKey: String): Asset

    @GET("api/v2/assets/{assetKey}/profile")
    suspend fun getAssetProfile(@Query("assetKey") assetKey: String): AssetProfile

}
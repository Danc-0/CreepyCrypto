package daniel.danc.creepycrypto.domain.usecases.get_asset

import daniel.danc.creepycrypto.common.Resource
import daniel.danc.creepycrypto.domain.models.Asset.Asset
import daniel.danc.creepycrypto.domain.repository.AssetRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAssetUseCase @Inject constructor(private val repository: AssetRepository) {

    operator fun invoke(assetKey: String): Flow<Resource<Asset>> = flow {

        try {
            emit(Resource.Loading())
            val coin = repository.getAssetByKey(assetKey)
            emit(Resource.Success(coin))

        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))

        } catch (e: IOException){
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }

    }

}
package daniel.danc.creepycrypto.domain.usecases.get_assets

import daniel.danc.creepycrypto.common.Resource
import daniel.danc.creepycrypto.domain.models.Assets.Data
import daniel.danc.creepycrypto.domain.repository.AssetRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAssetsUseCase @Inject constructor(private val repository: AssetRepository) {

    operator fun invoke(): Flow<Resource<List<Data>>> = flow {

        try {
            emit(Resource.Loading())
            val coins = repository.getAssets().data
            emit(Resource.Success(coins))

        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))

        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }

    }

}
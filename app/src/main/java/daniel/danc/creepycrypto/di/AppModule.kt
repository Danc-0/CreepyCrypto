package daniel.danc.creepycrypto.di

import dagger.Provides
import daniel.danc.creepycrypto.common.Constants
import daniel.danc.creepycrypto.data.remote.MessariApi
import daniel.danc.creepycrypto.data.repository.AssetRepositoryImplementation
import daniel.danc.creepycrypto.domain.repository.AssetRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

object AppModule {

    private val loggingInterceptor: HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val okHttpClient: OkHttpClient =
        OkHttpClient().newBuilder().addInterceptor(loggingInterceptor).build()


    @Provides
    @Singleton
    fun providesAssetsApi(): MessariApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MessariApi::class.java)
    }

    @Provides
    @Singleton
    fun provideAssetRepository(api: MessariApi): AssetRepository {
        return AssetRepositoryImplementation(api)
    }

}
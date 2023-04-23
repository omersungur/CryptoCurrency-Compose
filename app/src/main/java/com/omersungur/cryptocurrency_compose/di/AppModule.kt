package com.omersungur.cryptocurrency_compose.di

import com.omersungur.cryptocurrency_compose.common.Constants.BASE_URL
import com.omersungur.cryptocurrency_compose.data.remote.CoinPaprikaAPI
import com.omersungur.cryptocurrency_compose.data.repository.CoinRepositoryImpl
import com.omersungur.cryptocurrency_compose.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAPI() : CoinPaprikaAPI {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: CoinPaprikaAPI) : CoinRepository {
        return CoinRepositoryImpl(api)
    }
}
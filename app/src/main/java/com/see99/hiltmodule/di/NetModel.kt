package com.see99.hiltmodule.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NetModel {

    @Provides
    fun provideTestString():String{
        return "hello hilt!"
    }
}
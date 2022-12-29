package com.mediaproject.practiceproject.di

import android.content.ContentResolver
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.mediaproject.data.db.TestDatabase
import com.mediaproject.data.db.dao.SampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideTestDatabase(
        @ApplicationContext context: Context
    ): TestDatabase = Room.databaseBuilder(context, TestDatabase::class.java, TestDatabase.DATABASE_NAME).build()

    @Provides
    @Singleton
    fun provideSampleDao(
        database: TestDatabase
    ): SampleDao = database.sampleDao()

    @Singleton
    @Provides
    fun provideUserSharedPreference(
        @ApplicationContext context: Context
    ): SharedPreferences = context.getSharedPreferences("preferences_name", Context.MODE_PRIVATE)

}
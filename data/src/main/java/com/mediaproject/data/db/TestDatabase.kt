package com.mediaproject.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mediaproject.data.db.dao.SampleDao
import com.mediaproject.data.db.entity.SampleEntity

@Database(
    entities = arrayOf(
        SampleEntity::class,
    ),
    version = 1
)
abstract class TestDatabase : RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "TestDatabase"
    }

    abstract fun sampleDao(): SampleDao
}
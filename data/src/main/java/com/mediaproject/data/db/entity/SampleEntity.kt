package com.mediaproject.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test")
data class SampleEntity(
    @PrimaryKey(autoGenerate = true) val id: Int
)

package com.example.dessertrelease.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.annotation.NonNull
import androidx.room.ColumnInfo

@Entity(tableName = "airport")
data class Flight(
    @PrimaryKey
    val id: Int,
    @NonNull
    @ColumnInfo(name = "name")
    val name: String,
    @NonNull
    @ColumnInfo(name = "iata_code")
    val iataCode: String,
    @NonNull
    @ColumnInfo(name = "passengers")
    val passengers: Int
)
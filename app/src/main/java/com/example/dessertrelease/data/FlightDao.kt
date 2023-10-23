package com.example.dessertrelease.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface FlightDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(flight: Flight)

    @Update
    suspend fun update(flight: Flight)

    @Delete
    suspend fun delete(flight: Flight)

    @Query(
        """
        SELECT * FROM airport 
        ORDER BY name ASC    
        """
    )
    fun getAll(): Flow<List<Flight>>

    @Query(
        """
        SELECT * FROM airport 
        WHERE name = :name 
        ORDER BY passengers ASC 
        """
    )
    fun getByFlightName(name: String): Flow<List<Flight>>
}
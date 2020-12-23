package com.example.roomdatabase.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomdatabase.model.Friend


@Dao
interface FriendDAO {

    @Query("SELECT * FROM friend")
    fun getAllFriends(): List<Friend>

    @Insert
    fun insertFriend(friend: Friend)
}
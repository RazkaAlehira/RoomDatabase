package com.example.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabase.DAO.FriendDAO
import com.example.roomdatabase.model.Friend


@Database(entities = [Friend::class], version = 1)
abstract class FriendDatabase : RoomDatabase() {

    abstract fun friendDao(): FriendDAO
}
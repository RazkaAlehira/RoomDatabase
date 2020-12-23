package com.example.roomdatabase

import android.os.Bundle
import android.util.Log.d
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.roomdatabase.adapter.FriendsAdapter
import com.example.roomdatabase.databinding.ActivityMainBinding
import com.example.roomdatabase.model.Friend
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityMainBinding.inflate(inflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val database = Room.databaseBuilder(this, FriendDatabase::class.java, "friend_database")
            .allowMainThreadQueries()
            .build()

        database.friendDao().insertFriend(Friend(firstName = "Radithya", rating = 500))

        val allFriends = database.friendDao().getAllFriends()

        rv_friends.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = FriendsAdapter(allFriends)
        }
    }
}
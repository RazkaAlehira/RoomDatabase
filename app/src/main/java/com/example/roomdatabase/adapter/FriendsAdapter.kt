package com.example.roomdatabase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.R
import com.example.roomdatabase.model.Friend
import kotlinx.android.synthetic.main.friends_row.view.*

class FriendsAdapter( private val allFriend: List<Friend>) : RecyclerView.Adapter<FriendsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.friends_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FriendsAdapter.ViewHolder, position: Int) {
        holder.itemView.txt_name.text = allFriend[position].firstName
    }

    override fun getItemCount() = allFriend.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}
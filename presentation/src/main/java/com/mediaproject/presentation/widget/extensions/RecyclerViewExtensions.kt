package com.mediaproject.practiceproject.widget.extensions

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//Vertical RecyclerView
fun RecyclerView.showVertical(context: Context){
    this.layoutManager =
        LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
}

//Horizontal RecyclerView
fun RecyclerView.showHorizontal(context: Context){
    this.layoutManager =
        LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
}
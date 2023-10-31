package com.example.mad_assignment_2_22172012005

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ToDoAdapter(context: Context, toDoList:MutableList<ToDoModel>) :BaseAdapter {
    private val inflater:LayoutInflater= LayoutInflater.from(context)
    private var itemList = toDoList
    override fun getCount(): Int {
        val p0
        val UID: String = itemList.get(p0).UDI as String
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }
}
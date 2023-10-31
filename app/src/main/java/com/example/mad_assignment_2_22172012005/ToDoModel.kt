package com.example.mad_assignment_2_22172012005

class ToDoModel {
    companion object Factory{
        fun createList(): ToDoModel = ToDoModel()
    }
    var UDI: String? = null
    var itemDataText: String? = null
    var done: Boolean? = false
}
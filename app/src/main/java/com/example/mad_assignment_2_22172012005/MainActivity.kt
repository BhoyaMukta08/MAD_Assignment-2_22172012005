package com.example.mad_assignment_2_22172012005

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.core.view.View

class MainActivity : AppCompatActivity() {
    lateinit var database: DatabaseReference
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab=findViewById<View>(/* id = */ R.id.fab) as FloatingActionButton
        database = FirebaseDatabase.getInstance().reference

        fab.setOnClickListener { view ->
            val alertDialog = AlertDialog.Builder(this)
            val textEditText = EditText(this)
            alertDialog.setMessage("Add TODO item")
            alertDialog.setTitle("Enter To Do item")
            alertDialog.setView(textEditText)
            alertDialog.setPositiveButton("Add"){dialog, i ->
                val todoItemData = ToDoModel.createList()
                todoItemData.itemDataText=textEditText.text.toString()
                todoItemData.done= false
                val newItemData = database.child("todo").push()
                todoItemData.UDI = newItemData.key

                newItemData.setValue(todoItemData)

                dialog.dismiss()
                Toast.makeText(this."item saved", Toast.LENGTH_LONG).show()
            }
            alertDialog.show()
        }
    }
}
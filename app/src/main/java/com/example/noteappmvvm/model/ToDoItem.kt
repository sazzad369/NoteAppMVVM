package com.example.noteappmvvm.model

import android.icu.text.CaseMap.Title

data class ToDoItem(
    val id:Int ,
    val title: String,
    val isComplete : Boolean
)

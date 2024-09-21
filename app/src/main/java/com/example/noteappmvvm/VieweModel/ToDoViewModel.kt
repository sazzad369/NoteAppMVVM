package com.example.noteappmvvm.VieweModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.noteappmvvm.Repository.ToDoRepository
import com.example.noteappmvvm.model.ToDoItem

class ToDoViewModel:ViewModel() {
    private val repository = ToDoRepository()
    private val _todoItems = MutableLiveData<List<ToDoItem>>()
  val toDoItems:LiveData<List<ToDoItem>> = _todoItems

    init {
        _todoItems.value = repository.getTodoItems()
    }
    fun markItemAsCompleted(id:Int){
        val updatedList = toDoItems.value?.map {
            if (it.id == id){
                it.copy(isComplete = true)
            }else{
                it
            }
        }
        _todoItems.value = updatedList
    }
}
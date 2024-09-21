package com.example.noteappmvvm.Repository

import com.example.noteappmvvm.model.ToDoItem

 class ToDoRepository{
    private val todoList = mutableListOf<ToDoItem>()

    init {
        todoList.add(ToDoItem(1, "Read a book", false));
        todoList.add(ToDoItem(2, "Complete Assignment", false));
        todoList.add(ToDoItem(3, "Call the Doctor", true));
        todoList.add(ToDoItem(4, "Pay Electricity Bill", false));
        todoList.add(ToDoItem(5, "Pick Up Laundry", true));
        todoList.add(ToDoItem(6, "Water the Plants", false));
        todoList.add(ToDoItem(7, "Read a Book", true));
        todoList.add(ToDoItem(8, "Book Flight Tickets", false));
        todoList.add(ToDoItem(9, "Meet with Client", false));
        todoList.add(ToDoItem(10, "Clean the House", true));
    }
     fun getTodoItems():List<ToDoItem> {
         return todoList
     }
}

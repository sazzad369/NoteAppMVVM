package com.example.noteappmvvm.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RemoteViews.RemoteCollectionItems
import androidx.recyclerview.widget.RecyclerView
import com.example.noteappmvvm.databinding.ItemTodoBinding
import com.example.noteappmvvm.model.ToDoItem


class toDoAdapter(private val toDoItems: List<ToDoItem>) :RecyclerView.Adapter<toDoAdapter.ToDoViewHolder>() {
    class ToDoViewHolder (private val binding: ItemTodoBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:ToDoItem){
            binding.noteTitle.text = item.title
            binding.CheckCompleted.isChecked = item.isComplete
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = ItemTodoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ToDoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return toDoItems.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.bind(toDoItems[position])
    }
}
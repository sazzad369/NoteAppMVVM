package com.example.noteappmvvm

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.noteappmvvm.Adapter.toDoAdapter
import com.example.noteappmvvm.VieweModel.ToDoViewModel
import com.example.noteappmvvm.databinding.ActivityMainBinding
import com.example.noteappmvvm.databinding.ItemTodoBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val toDoViewModel:ToDoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recycleview.layoutManager = LinearLayoutManager(this)

        toDoViewModel.toDoItems.observe(this, Observer {
            binding.recycleview.adapter = toDoAdapter(it)
        })
    }
}
package com.example.recyclerviewanddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanddatabinding.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var manager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = listOf(DataModel(1,"one"),
            DataModel(2,"two"),
            DataModel(3,"three"),
            DataModel(4,"four"),
            DataModel(5,"five"))


        GlobalScope.launch {
            manager=LinearLayoutManager(this@MainActivity)

            binding.recyclerview.apply {
                adapter=RecyclerViewAdapter(data)
                layoutManager=manager
        }


        }
    }
}
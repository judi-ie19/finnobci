package com.example.fibonacciactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fibonacciactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         sumDisplay()
    }
    fun sumDisplay() {
        var sumList = fibonacci(100)
        val sumAdapter =NumberRecyclerViewAdapter(sumList)
        binding.rvNumber.layoutManager = LinearLayoutManager(this)
        binding.rvNumber.adapter=sumAdapter
    }
    fun fibonacci(new:Int):List<Int>{
        val list = ArrayList<Int>()
        var previous = 0
        var current = 1
        for (i in 0..new){
            var sum = previous + current
            previous = current
            current = sum
            list += sum
        }
        return list
    }
}






package com.pavzar.viewbindingrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.pavzar.viewbindingrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)
        val adapter = MainAdapter(TaskList.taskList)
        binding?.taskRv?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding?.taskRv?.adapter = adapter

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
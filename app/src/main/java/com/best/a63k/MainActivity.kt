package com.best.a63k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.best.a63k.Adapter.AdapterA
import com.best.a63k.Module.Member

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
        val a = get()
        refresh(a)
    }

    private fun open() {
        recyclerView = findViewById(R.id.recyclerViewMain)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.isNestedScrollingEnabled = false
    }

    private fun refresh(list: ArrayList<Member>) {
        val adapters = AdapterA(list)
        recyclerView.adapter = adapters
    }

    private fun get(): ArrayList<Member> {
        val a = ArrayList<Member>()
        for (i in 1..15) {
            a.add(Member("First Screen $i", "Second Screen$i"))
        }
        return a
    }
}
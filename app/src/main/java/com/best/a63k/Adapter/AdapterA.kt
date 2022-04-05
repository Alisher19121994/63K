package com.best.a63k.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.best.a63k.Module.Member
import com.best.a63k.R

class AdapterA(var members: ArrayList<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter, parent, false)
        return mode(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val member = members[position]
        if (holder is mode) {
            holder.a.text = member.screenF
            holder.b.text = member.screenS
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    inner class mode(item: View) : RecyclerView.ViewHolder(item) {
        val a: TextView = item.findViewById(R.id.txt1)
        val b: TextView = item.findViewById(R.id.txt2)
    }
}
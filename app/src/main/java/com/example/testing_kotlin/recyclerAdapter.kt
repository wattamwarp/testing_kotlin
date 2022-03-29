package com.example.testing_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recyclerAdapter : RecyclerView.Adapter<recyclerAdapter.Holder>() {

    val title= arrayOf<String>("padmanabh","pallavi","vilas","vikas");
    val description= arrayOf<String>("description 1","description2","description 3","description4");

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id.tv_title);
        val description = view.findViewById<TextView>(R.id.tv_description);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {


        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_card, parent, false);

        return Holder(itemView);

    }

    override fun getItemCount(): Int {


        return  title.size;
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {


        holder.title.text= title[position];
        holder.description.text=description[position];
    }

}
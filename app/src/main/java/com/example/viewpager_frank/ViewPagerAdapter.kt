package com.example.viewpager_frank

import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_page.view.settingImage

class ViewPagerAdapter (private val title : List<String>, private val images: List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder> (){


    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.settingTitle)
        val itemImage: ImageView = itemView.findViewById(R.id.settingImage)

          }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page,parent,false ))
    }

    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {

        holder.itemTitle.text = title[position]
        holder.itemImage.setImageResource(images[position])

    }


}
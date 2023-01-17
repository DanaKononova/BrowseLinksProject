package com.example.browselinksproject

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TitleViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    fun onBind(item: UnionType.TitleData) {
        val siteType = itemView.findViewById<TextView>(R.id.title)
        siteType.text = item.siteType
    }
}
package com.example.browselinksproject

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SiteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @SuppressLint("QueryPermissionsNeeded")
    fun onBind(item: UnionType.SiteData) {
        val site = itemView.findViewById<TextView>(R.id.site)
        site.text = item.site

        itemView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(item.site)
            site.context.startActivity(intent)
        }
    }
}
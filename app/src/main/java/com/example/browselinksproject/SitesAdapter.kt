package com.example.browselinksproject

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SitesAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val TITLE_TYPE = 1
        private const val BODY_TYPE = 2
    }
    private val sites: MutableList<UnionType> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = when(viewType) {
        BODY_TYPE -> {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.rv_site, parent, false)
            SiteViewHolder(view)
        }
        TITLE_TYPE -> {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_title, parent, false)
            TitleViewHolder(view)
        }
        else -> throw Exception()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is SiteViewHolder -> holder.onBind(sites[position] as UnionType.SiteData)
            is TitleViewHolder -> holder.onBind(sites[position] as UnionType.TitleData)
        }
    }

    override fun getItemCount(): Int = sites.size

    override fun getItemViewType(position: Int): Int = when(sites[position]) {
        is UnionType.TitleData -> TITLE_TYPE
        is UnionType.SiteData -> BODY_TYPE
        else -> throw Exception()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(sites: List<UnionType>) {
        this.sites.clear()
        this.sites.addAll(sites)
        notifyDataSetChanged()
    }
}
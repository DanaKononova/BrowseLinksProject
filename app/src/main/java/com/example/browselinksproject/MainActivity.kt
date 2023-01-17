package com.example.browselinksproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sites = Server.getList()
        val recycler = findViewById<RecyclerView>(R.id.rvSitesList)
        val adapter = SitesAdapter()
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        adapter.setItems(sites)

        val androidListNew = Server.getList()
        adapter.setItems(androidListNew)
    }
}
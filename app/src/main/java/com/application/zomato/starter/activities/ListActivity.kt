package com.application.zomato.starter.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.application.zomato.starter.R
import com.application.zomato.starter.adapter.MyListAdapter
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val adapter = MyListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
        /**
         * Change the initialisation to your type of list
         */
        adapter.items = listOf("Item 1", "Item 2", "Item 3")
        /**
         * Very important operation to perform when data is changed
         */
        adapter.notifyDataSetChanged()
    }
}
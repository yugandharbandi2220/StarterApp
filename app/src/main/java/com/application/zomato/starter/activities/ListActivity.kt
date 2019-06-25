package com.application.zomato.starter.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.application.zomato.starter.R
import com.application.zomato.starter.adapter.MyListAdapter
import com.application.zomato.starter.data.Restaurant
import kotlinx.android.synthetic.main.activity_list.*
import java.util.ArrayList

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
        var rests : List<Restaurant> = ArrayList()

        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","40")
        rests+=Restaurant("KFC","Address","400")
        adapter.items = rests
        /**
         * Very important operation to perform when data is changed
         */
        adapter.notifyDataSetChanged()
    }
}
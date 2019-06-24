package com.application.zomato.starter.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.application.zomato.starter.R
import java.util.ArrayList

class MyListAdapter : RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    /**
     * Change the type of data in list to support your data
     */
    var items : List<String> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        /**
         * change R.id.layout_item_basic to your layout id
         */

        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_item_basic,p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(items[position])
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        private val textView : TextView = view.findViewById(R.id.text)

        fun bindData(s : String) {
            /**
             * use data and set on the view
             */
            textView.text = s
        }

    }
}
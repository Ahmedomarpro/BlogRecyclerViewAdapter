package com.ao.kotlinrecyclerview.basetestadapter;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ao.kotlinrecyclerview.R

class TestAdapter : RecyclerView.Adapter<TestAdapter.ViewHolder> {

    var listItime: List<String>

    constructor(listItime: List<String>) : super() {
        this.listItime = listItime
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var v = LayoutInflater.from(parent.context).inflate(R.layout.layout_blog_list_item, parent, false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return listItime?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var itemId = listItime.get(position)

        // holder.nameText.text = itemId.title

        holder.itemView.setOnClickListener {
            onClickListener?.onClickItem(position, itemId)

        }

    }

    var onClickListener: OnClickListener? = null

    interface OnClickListener {
        fun onClickItem(position: Int, model: String)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder
        (itemView) {

        //  var nameText = itemView.findViewById(R.id.textViewON) as TextView

    }
}
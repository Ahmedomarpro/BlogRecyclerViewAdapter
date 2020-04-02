package com.ao.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ao.kotlinrecyclerview.model.BlogPost
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_blog_list_item.view.*

import java.util.*

class BlogRecyclerAdapter( val  onItemClick : OnItemClick) : RecyclerView.Adapter<BlogRecyclerAdapter.ViewHolder>() {

    private val TAG: String = "AppDebug"
    private var items: List<BlogPost> = ArrayList()

    // var onClickListener: OnClickListener? = null
 
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_blog_list_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemID = items[position]

        when (holder) {
            else -> {
                holder.bind(itemID)
            }
        }

        holder.itemView.setOnClickListener {
            onItemClick?.onItemClick(position,itemID)

        }


    }

    fun submitList(blogList: List<BlogPost>) {
        items = blogList
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val blog_image = itemView.blog_image
        val blog_title = itemView.blog_title
        val blog_author = itemView.blog_author

        fun bind(blogPost: BlogPost) {

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(blogPost.image)
                .into(blog_image)

            blog_title.text = blogPost.title
            blog_author.text = blogPost.username
        }

    }
}
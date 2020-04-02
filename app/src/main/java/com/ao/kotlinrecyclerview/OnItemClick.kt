package com.ao.kotlinrecyclerview

import com.ao.kotlinrecyclerview.model.BlogPost

interface OnItemClick {
    fun onItemClick(postion : Int , model : BlogPost)
}
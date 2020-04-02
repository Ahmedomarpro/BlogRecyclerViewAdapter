package com.ao.kotlinrecyclerview.model

data class BlogPost(
    var title: String,
    var body: String,
    var image: String,
    var username: String //Author blog post
) {
    override fun toString(): String {
        return  "BlogPost(title='$title', image='$image', username='$username')"
    }
}
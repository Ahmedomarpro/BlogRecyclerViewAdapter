package com.ao.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ao.kotlinrecyclerview.model.BlogPost
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.DriverManager.println

class MainActivity : AppCompatActivity(),OnItemClick {

    private lateinit var blogAdapter : BlogRecyclerAdapter


    /*
     lateinit
    inline

    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
        blogAdapter.onItemClick
    }

    private fun addDataSet() {

        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)

     }

    private fun initRecyclerView() {

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(40)
            addItemDecoration(topSpacingDecorator)
            blogAdapter = BlogRecyclerAdapter(this@MainActivity)
            adapter= blogAdapter

        }

     }

    init {
        println("I'm called before the secondary constructor")
    }

    override fun onItemClick(postion: Int, model: BlogPost) {
        Toast.makeText(this,"WWWW"+postion+model, Toast.LENGTH_SHORT).show()

    }
}

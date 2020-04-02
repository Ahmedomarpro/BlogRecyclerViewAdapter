package com.ao.kotlinrecyclerview.basetestadapter

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Test : AppCompatActivity(){

    lateinit var r : View
    lateinit var rC : Context

    var items: List<String> = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getO {  }


        Toast.makeText(rC,"",Toast.LENGTH_LONG).show()
        singletonList("eronreoin")
        getOddLengthString("")
        for (index in items.indices) {
            // access items using index
            // items.get(index)
        }
     }


    var nickname: String? = null
    val i: Int = 42     // automatic boxing
    val j: Any? = null  // nullable


    val safe = nickname ?: "unknown"
    val length = nickname!!.length
    var  k = nickname?.length
    val name = "Kotlin"
    val hello = "Hello $name"
    fun <T> singletonList(item: T) {/**/}
    companion object {
        fun getOddLengthString(str: String): String? {
            if (str.length % 2 == 0) return null

            return str


        }
    }



    inline fun getO(action: () -> Unit) {

        try {
            println("Hello!")
            action()
        } finally {
            println("Goodbye!")
        }


        try {

        }catch (e: NumberFormatException){}
         try {
             println("Hello!")
             println("How are you?")
         }finally{
             println("Goodbye!")
         }

     }
    fun setup(_view: View) {
        // ensure the lateinit var hasn't been initialized
        if(this::r.isInitialized) throw IllegalStateException()
        r = _view
    }


    inline fun upperCase(str: String): String {

        return if (str.isNotEmpty()) str.toUpperCase() else "";

    }


    inline fun higherOrderFunction(crossinline aLambda: () -> Unit) {

        normalFunction {
            aLambda() //must mark aLambda as crossinline to use in this context.
        }

    }

    fun normalFunction(aLambda: () -> Unit) {

        return

    }



}

        open class Animal {
        // This class is open and
        // can be inherited
            val y: Int? = 555

            val x: String? = y as String?
            val xs: String? = y as String?
        }

          class Dog : Animal() {
        // Notice the paranthesis
        // Class dog is final and
        // can't be inherited
        }
// Compiler throws error

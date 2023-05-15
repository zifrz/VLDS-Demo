package com.example.linkedlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var counter = -1

    val node_a = findViewById<ImageView>(R.id.node_a)
    val node_b = findViewById<ImageView>(R.id.node_b)
    val node_c = findViewById<ImageView>(R.id.node_c)
    val node_d = findViewById<ImageView>(R.id.node_d)
    val node_e = findViewById<ImageView>(R.id.node_e)

    val link_a_b = findViewById<ImageView>(R.id.link_a_b)
    val link_b_c = findViewById<ImageView>(R.id.link_b_c)
    val link_c_d = findViewById<ImageView>(R.id.link_c_d)
    val link_d_e = findViewById<ImageView>(R.id.link_d_e)
    val link_e_f = findViewById<ImageView>(R.id.link_e_f)

    val addNodeBtn = findViewById<Button>(R.id.addNode)
    val delNodeBtn = findViewById<Button>(R.id.delNode)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        addNodeBtn.setOnClickListener {

            addNode()

        }

        delNodeBtn.setOnClickListener {

            delNode()

        }
    }

    fun addNode(){

        if (counter == -1){

            node_a.visibility = View.VISIBLE
            link_a_b.visibility = View.VISIBLE

            counter++
        }

        if (counter == 0){
            node_b.visibility = View.VISIBLE
            link_b_c.visibility = View.VISIBLE

            counter++
        }

        if (counter == 1){
            node_c.visibility = View.VISIBLE
            link_c_d.visibility = View.VISIBLE

            counter++
        }

        if (counter == 2){
            node_d.visibility = View.VISIBLE
            link_d_e.visibility = View.VISIBLE

            counter++
        }

        if (counter == 3){
            node_e.visibility = View.VISIBLE
//            link_e_f.visibility = View.VISIBLE

            counter++
        }

        if (counter == 4){
            counter = 4
            Toast.makeText(applicationContext, "That is enough", Toast.LENGTH_SHORT).show()
        }


    }

    fun delNode(){

        if (counter == 0){
            node_a.visibility = View.INVISIBLE
            link_a_b.visibility = View.INVISIBLE

            counter--
        }

        if (counter == 1){
            node_b.visibility = View.INVISIBLE
            link_b_c.visibility = View.INVISIBLE

            counter--
        }

        if (counter == 2){
            node_c.visibility = View.INVISIBLE
            link_c_d.visibility = View.INVISIBLE

            counter--
        }

        if (counter == 3){
            node_d.visibility = View.INVISIBLE
            link_d_e.visibility = View.INVISIBLE

            counter--
        }

        if (counter == 4){
            node_e.visibility = View.INVISIBLE
//            link_e_f.visibility = View.VISIBLE

            counter--
        }

        if (counter == -1){
            counter = -1
            Toast.makeText(applicationContext, "That is enough", Toast.LENGTH_SHORT).show()
        }


    }
}
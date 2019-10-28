package com.example.listfilm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var rvFilm:RecyclerView
    private lateinit var list: ArrayList<Film>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFilm=findViewById(R.id.Rv_film)


        list.addAll(film_data.listdata)
        showRecyclerList()




    }

    private fun showRecyclerList() {
        rvFilm.layoutManager = LinearLayoutManager(this)


    }


}

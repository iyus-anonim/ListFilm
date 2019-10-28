package com.example.listfilm

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import java.util.*

class adapter_list(private val listfilm: ArrayList<Film>) : RecyclerView.Adapter<adapter_list.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.row_film, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val film= listfilm[position]

        Glide.with(holder.itemView.context)
            .load(film.Foto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvJudul.text=film.judul
        holder.tvDetail.text = film.gendre

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listfilm[holder.adapterPosition]) }
    }



    override fun getItemCount(): Int {
        return listfilm.size
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_icon)
        var tvJudul: TextView = itemView.findViewById(R.id.tv_judul)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data:Film)
    }
}
package com.example.practica

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.compose.ui.layout.Layout
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val item_1 = arrayOf("Daniela", "ANTONIA", "CARLOTA",
        "LISA")

    val item_2 = arrayOf("MARIA","MICHAELA", "ROSA",
        "ANA")

    val images = intArrayOf(R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.item_1.text = item_1[i]
        viewHolder.item_2.text = item_2[i]
        viewHolder.itemImage.setImageResource(images[i])

    }
    override fun getItemCount(): Int {
        return item_1.size // O utiliza item_2.size o images.size, ya que deberían tener la misma longitud
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var item_1: TextView
        var item_2: TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            item_1 = itemView.findViewById(R.id.item_1)
            item_2= itemView.findViewById(R.id.item_2)
        }
    }
}
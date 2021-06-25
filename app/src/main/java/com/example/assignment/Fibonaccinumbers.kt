package com.example.assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class Fibonaccinumbers(var numbList:List<BigInteger>): RecyclerView.Adapter<NumbersVieHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersVieHolder {
        var  item = LayoutInflater.from(parent.context).inflate(R.layout.numb_list_item,parent,false)
        return NumbersVieHolder(item)
    }

    override fun onBindViewHolder(holder: NumbersVieHolder, position: Int) {
     holder.name.text = numbList.get(position).toString()
    }

    override fun getItemCount(): Int {
  return numbList.size
    }
}
class NumbersVieHolder(item:View):RecyclerView.ViewHolder(item){
    var name = item.findViewById<TextView>(R.id.tvnumbers)
}
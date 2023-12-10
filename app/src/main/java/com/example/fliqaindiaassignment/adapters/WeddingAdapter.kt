package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.WeddingItemBinding
import com.example.fliqaindiaassignment.utils.WeddingModel

class WeddingAdapter : RecyclerView.Adapter<WeddingAdapter.ViewHolder>() {

    private var data = listOf<WeddingModel>()
    internal fun setData(dataList: List<WeddingModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: WeddingItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: WeddingModel
        ) {
            binding.wedding = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = WeddingItemBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

}
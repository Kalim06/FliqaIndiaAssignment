package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.BlogItemBinding
import com.example.fliqaindiaassignment.utils.BlogsModel

class BlogsAdapter : RecyclerView.Adapter<BlogsAdapter.ViewHolder>() {

    private var data = listOf<BlogsModel>()
    internal fun setData(dataList: List<BlogsModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: BlogItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: BlogsModel
        ) {
            binding.blog = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = BlogItemBinding.inflate(layoutInflater, parent, false)

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
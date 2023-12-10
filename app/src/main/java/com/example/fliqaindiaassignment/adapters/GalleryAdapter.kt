package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.GalleryItemBinding
import com.example.fliqaindiaassignment.utils.GalleryModel

class GalleryAdapter : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    private var data = listOf<GalleryModel>()
    internal fun setData(dataList: List<GalleryModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: GalleryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: GalleryModel
        ) {
            binding.galleryImages = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = GalleryItemBinding.inflate(layoutInflater, parent, false)

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
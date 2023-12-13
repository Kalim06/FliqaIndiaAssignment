package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.LocationItemBinding
import com.example.fliqaindiaassignment.utils.LocationModel

class LocationAdapter : RecyclerView.Adapter<LocationAdapter.ViewHolder>() {

    private var data = listOf<LocationModel>()
    internal fun setData(dataList: List<LocationModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: LocationItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: LocationModel
        ) {
            binding.location = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = LocationItemBinding.inflate(layoutInflater, parent, false)

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
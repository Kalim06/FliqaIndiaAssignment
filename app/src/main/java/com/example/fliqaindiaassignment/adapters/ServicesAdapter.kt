package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.ServiceItemBinding
import com.example.fliqaindiaassignment.utils.ServicesModel

class ServicesAdapter : RecyclerView.Adapter<ServicesAdapter.ViewHolder>() {

    private var data = listOf<ServicesModel>()
    internal fun setData(dataList: List<ServicesModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: ServiceItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: ServicesModel
        ) {
            binding.services = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ServiceItemBinding.inflate(layoutInflater, parent, false)

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
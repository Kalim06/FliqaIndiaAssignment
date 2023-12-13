package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.ClientItemBinding
import com.example.fliqaindiaassignment.utils.ClientsModel

class ClientAdapter : RecyclerView.Adapter<ClientAdapter.ViewHolder>() {

    private var data = listOf<ClientsModel>()
    internal fun setData(dataList: List<ClientsModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: ClientItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: ClientsModel
        ) {
            binding.client = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ClientItemBinding.inflate(layoutInflater, parent, false)

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
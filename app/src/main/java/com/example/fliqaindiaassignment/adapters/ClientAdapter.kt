package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.ClientItemBinding
import com.example.fliqaindiaassignment.utils.ClientsModel

class ClientAdapter(private val clickListener: ClientClickListener) : RecyclerView.Adapter<ClientAdapter.ViewHolder>() {

    private var data = listOf<ClientsModel>()
    internal fun setData(dataList: List<ClientsModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: ClientItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: ClientsModel,
            clickListener: ClientClickListener
        ) {
            binding.client = item
            binding.clickListener = clickListener
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
        holder.bind(data[position],clickListener)
    }

    override fun getItemCount() = data.size
}

class ClientClickListener(val clickListener: (link: String) -> Unit) {
    fun onClick(client: ClientsModel) = clickListener(client.link)
}
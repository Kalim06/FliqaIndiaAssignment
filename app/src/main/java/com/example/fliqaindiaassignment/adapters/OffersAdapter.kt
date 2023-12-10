package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.OffersItemBinding
import com.example.fliqaindiaassignment.utils.OfferModel

class OffersAdapter : RecyclerView.Adapter<OffersAdapter.ViewHolder>() {

    private var data = listOf<OfferModel>()
    internal fun setData(dataList: List<OfferModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: OffersItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: OfferModel
        ) {
            binding.offers = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = OffersItemBinding.inflate(layoutInflater, parent, false)

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
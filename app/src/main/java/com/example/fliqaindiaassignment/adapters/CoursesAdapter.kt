package com.example.fliqaindiaassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fliqaindiaassignment.databinding.CourseItemBinding
import com.example.fliqaindiaassignment.utils.CoursesModel

class CoursesAdapter : RecyclerView.Adapter<CoursesAdapter.ViewHolder>() {

    private var data = listOf<CoursesModel>()
    internal fun setData(dataList: List<CoursesModel>) {
        this.data = dataList
    }

    class ViewHolder private constructor(private val binding: CourseItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: CoursesModel
        ) {
            binding.course = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {

                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = CourseItemBinding.inflate(layoutInflater, parent, false)

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
package com.example.fliqaindiaassignment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.fliqaindiaassignment.R
import com.example.fliqaindiaassignment.databinding.FragmentHomeImageBinding

class HomeImageFragment : Fragment() {

    private var _binding: FragmentHomeImageBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeImageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val homeImages = arrayOf(
            R.drawable.home_image_one,
            R.drawable.home_image_two,
            R.drawable.home_image_three,
            R.drawable.home_image_four
        )

        val position = requireArguments().getInt(ARG_POSITION)
        Glide.with(this)
            .load(homeImages[position])
            .placeholder(R.drawable.loading_animation)
            .error(R.drawable.broken_image)
            .centerCrop()
            .into(binding.homeSlidingImageView)
    }

    companion object {
        const val ARG_POSITION = "position"

        fun getInstance(position: Int): Fragment {
            val fragment = HomeImageFragment()
            val bundle = Bundle()
            bundle.putInt(ARG_POSITION, position)
            fragment.arguments = bundle
            return fragment
        }
    }
}
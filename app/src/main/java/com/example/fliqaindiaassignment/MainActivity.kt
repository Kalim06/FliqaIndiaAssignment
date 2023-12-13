package com.example.fliqaindiaassignment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.fliqaindiaassignment.adapters.BlogsAdapter
import com.example.fliqaindiaassignment.adapters.CategoryAdapter
import com.example.fliqaindiaassignment.adapters.ClientAdapter
import com.example.fliqaindiaassignment.adapters.ClientClickListener
import com.example.fliqaindiaassignment.adapters.CoursesAdapter
import com.example.fliqaindiaassignment.adapters.GalleryAdapter
import com.example.fliqaindiaassignment.adapters.LocationAdapter
import com.example.fliqaindiaassignment.adapters.OffersAdapter
import com.example.fliqaindiaassignment.adapters.ServicesAdapter
import com.example.fliqaindiaassignment.adapters.WeddingAdapter
import com.example.fliqaindiaassignment.databinding.ActivityMainBinding
import com.example.fliqaindiaassignment.home.HomeImageAdapter
import com.example.fliqaindiaassignment.utils.Constants
import com.example.fliqaindiaassignment.utils.watchYoutube
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {

    //ViewBinding Variable
    private lateinit var binding: ActivityMainBinding

    //Home Image Sliding Variables
    private var currentPage = 0
    private lateinit var slidingImageDots: Array<ImageView?>
    private var slidingDotsCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Menu Functionality (Open)
        binding.menuBtn.setOnClickListener {
            binding.menuContainer.visibility = View.VISIBLE
        }

        //Menu Functionality (Close)
        binding.menu.menuCloseBtn.setOnClickListener {
            binding.menuContainer.visibility = View.GONE
        }

        //HomeSlidingViewPage
        setUpSlidingViewPager()

        //Services RecyclerView
        val servicesAdapter = ServicesAdapter()
        binding.servicesLayout.serviceRecyclerView.adapter = servicesAdapter

        //Set Data
        val servicesList = Constants.getServices()
        servicesAdapter.setData(servicesList)

        //Gallery RecyclerView
        val galleryAdapter = GalleryAdapter()
        binding.galleryLayout.galleryRecyclerView.adapter = galleryAdapter

        //Set Data
        val galleryList = Constants.getGalleryImages()
        galleryAdapter.setData(galleryList)

        //Offers RecyclerView
        val offersAdapter = OffersAdapter()
        binding.offersLayout.offersRecyclerView.adapter = offersAdapter

        //Set Data
        val offersList = Constants.getOffers()
        offersAdapter.setData(offersList)

        //Wedding RecyclerView
        val weddingAdapter = WeddingAdapter()
        binding.weddingLayout.weddingRecyclerView.adapter = weddingAdapter

        //Set Data
        val weddingList = Constants.getWeddings()
        weddingAdapter.setData(weddingList)

        //Courses RecyclerView
        val courAdapter = CoursesAdapter()
        binding.coursesLayout.coursesRecyclerView.adapter = courAdapter

        //Set Data
        val coursesList = Constants.getCourses()
        courAdapter.setData(coursesList)

        //Blogs RecyclerView
        val blogsAdapter = BlogsAdapter()
        binding.blogsLayout.blogsRecyclerView.adapter = blogsAdapter

        //Set Data
        val blogsList = Constants.getBlogs()
        blogsAdapter.setData(blogsList)

        //Client RecyclerView
        val clientAdapter =
            ClientAdapter(ClientClickListener { link ->
                watchYoutube(link)
            })
        binding.clientsLayout.clientsRecyclerView.adapter = clientAdapter

        //Set Data
        val clientList = Constants.getClients()
        clientAdapter.setData(clientList)

        //Categories RecyclerView
        val categoryAdapter = CategoryAdapter()
        binding.bottomLayout.categoriesRecyclerView.adapter = categoryAdapter

        //Set Data
        val categoryList = Constants.getCategories()
        categoryAdapter.setData(categoryList)

        //Location RecyclerView
        binding.bottomLayout.locationRecyclerView.layoutManager = GridLayoutManager(this, 2)
        val locationAdapter = LocationAdapter()
        binding.bottomLayout.locationRecyclerView.adapter = locationAdapter

        //Set Data
        val locationsList = Constants.getLocations()
        locationAdapter.setData(locationsList)
    }

    private fun setUpSlidingViewPager() {

        //Set ViewPager
        val landingImagesAdapter = HomeImageAdapter(this, 4)
        binding.homeViewPager.apply {
            adapter = landingImagesAdapter
            registerOnPageChangeCallback(slidingCallback)
        }

        //Set SliderCountDots
        slidingDotsCount = 4
        slidingImageDots = arrayOfNulls(slidingDotsCount)

        for (i in 0 until slidingDotsCount) {
            slidingImageDots[i] = ImageView(this)
            slidingImageDots[i]?.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext, R.drawable.inactive_dot
                )
            )
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
            )

            params.setMargins(8, 0, 8, 0)
            binding.homeSliderDots.addView(slidingImageDots[i], params)
        }

        slidingImageDots[0]?.setImageDrawable(
            ContextCompat.getDrawable(
                applicationContext, R.drawable.active_dot
            )
        )

        //Timer to change image every 10 seconds
        Timer().schedule(object : TimerTask() {
            // task to be scheduled
            override fun run() {
                Handler(Looper.getMainLooper()).postDelayed({

                    if (currentPage == 4) {
                        currentPage = 0
                    }

                    //The second parameter ensures smooth scrolling
                    binding.homeViewPager.setCurrentItem(currentPage++, true)

                }, 0)
            }
        }, 5000, 5000)

    }

    //Update Current SliderDots on ViewPager Changes
    private val slidingCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            for (i in 0 until slidingDotsCount) {
                currentPage = position
                slidingImageDots[i]?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext, R.drawable.inactive_dot
                    )
                )
            }

            slidingImageDots[position]?.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext, R.drawable.active_dot
                )
            )
        }
    }

    //Unregister ViewPager Callback
    override fun onDestroy() {
        super.onDestroy()
        binding.homeViewPager.unregisterOnPageChangeCallback(slidingCallback)
    }

}
package com.example.viewpager_frank

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.view_pager2
import me.relex.circleindicator.CircleIndicator
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {
    private val settingList = mutableListOf<String>()
    private val barcodeList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()
        view_pager2.adapter = ViewPagerAdapter(settingList, barcodeList)
        view_pager2.orientation = view_pager2.orientation

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(view_pager2)
    }

    private fun addToList(title: String, image: Int) {
        settingList.add(title)
        barcodeList.add(image)


    }

    private fun postToList() {
        for (i in 1..5) {
            addToList("Title $i", R.mipmap.ic_launcher_round)
        }
    }


}
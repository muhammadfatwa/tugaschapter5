package com.example.kertasbatugunting

import Fragment.LadingPage3fragment
import Fragment.Ladingpage1fragment
import Fragment.Ladingpage2fragment
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.viewpager.widget.ViewPager
import com.example.kertasbatugunting.databinding.AcctivityLandingBinding

class LadingpageActivity : AppCompatActivity (){
    private val binding:AcctivityLandingBinding by lazy {
        AcctivityLandingBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

     val Ladingpage1fragment = Ladingpage1fragment()
        val Ladingpage2fragment= Ladingpage2fragment()
        val LadingPage3fragment= LadingPage3fragment()
        val LandingPagerAdapter=LandingPagerAdapter(
            fragmentManager = supportFragmentManager,
            Ladingpage1fragment,Ladingpage2fragment,LadingPage3fragment
        )
        binding.vpLanding.adapter = LandingPagerAdapter
        binding.dotIndicator.attachTo(binding.vpLanding)

        binding.btnNext.setOnClickListener {
            val currentPossition = binding.vpLanding.currentItem
            binding.vpLanding.setCurrentItem(currentPossition + 1,true)
        }
        binding.vpLanding.addOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val isLasposition = position == LandingPagerAdapter.count -1
                toast("is last position -> $isLasposition")
                binding.btnNext.isVisible= ! isLasposition
            }
        }
        )
    }
}
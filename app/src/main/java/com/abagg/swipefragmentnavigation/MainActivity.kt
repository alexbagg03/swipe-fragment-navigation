package com.abagg.swipefragmentnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HostNavigationListener {

    private var pagerAdapter: NavigationFragmentPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pagerAdapter = NavigationFragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter

        viewPager.setPageTransformer(false, DepthPageTransformer())

        pushFragment(BlueFragment.newInstance())
    }

    override fun pushFragment(fragment: Fragment) {
        pagerAdapter?.push(fragment)
        pagerAdapter?.getLastIndex()?.let {
            index -> viewPager.setCurrentItem(index, true)
        }
    }

    override fun popFragment() {
        pagerAdapter?.getLastIndex()?.let {
            index -> if (index > 0) {
//                val pageChangeListener = object : ViewPager.OnPageChangeListener {
//                    override fun onPageScrollStateChanged(state: Int) {}
//
//                    override fun onPageScrolled(position: Int, postionOffset: Float, positionOffsetPixels: Int) {}
//
//                    override fun onPageSelected(position: Int) {
//                        viewPager.removeOnPageChangeListener(this);
//                        pagerAdapter?.pop()
//                    }
//                }
//                viewPager.addOnPageChangeListener(pageChangeListener)
                viewPager.setCurrentItem(index - 1, true)
            }
        }
    }

}

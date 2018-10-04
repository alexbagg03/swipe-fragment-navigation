package com.abagg.swipefragmentnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HostNavigationListener {

    private var pagerAdapter: NavigationFragmentPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pagerAdapter = NavigationFragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter

        pushFragment(BlueFragment.newInstance())
    }

    override fun pushFragment(fragment: Fragment) {
        pagerAdapter?.push(fragment)
        pagerAdapter?.getLastIndex()?.let { index -> viewPager.setCurrentItem(index, true) }
    }

    override fun popFragment() {
        pagerAdapter?.pop()
        pagerAdapter?.getLastIndex()?.let { index -> viewPager.setCurrentItem(index, true) }
    }

}

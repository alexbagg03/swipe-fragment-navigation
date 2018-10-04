package com.abagg.swipefragmentnavigation

import android.support.v4.app.Fragment

interface HostNavigationListener {
    fun pushFragment(fragment: Fragment)
    fun popFragment()
}
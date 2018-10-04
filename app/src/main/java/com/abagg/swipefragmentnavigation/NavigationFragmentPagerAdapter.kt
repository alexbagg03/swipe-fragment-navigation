package com.abagg.swipefragmentnavigation

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.ViewGroup
import java.util.*

class NavigationFragmentPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragmentStack: Stack<Fragment> = Stack()

    override fun getItem(i: Int): Fragment? {
        return if (i >= 0 && i < fragmentStack.size) fragmentStack[i] else null
    }

    override fun getCount(): Int {
        return fragmentStack.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val fragment = getItem(position)
        return if (fragment != null) fragment.javaClass.simpleName else ""
    }

//    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
//        val fragmentManager = (Fragment) obj
//    }

    fun push(fragment: Fragment) {
        fragmentStack.push(fragment)
        notifyDataSetChanged()
    }

    fun pop() {
        fragmentStack.pop()
        notifyDataSetChanged()
    }

    fun getLastIndex(): Int {
        return fragmentStack.lastIndex
    }

}

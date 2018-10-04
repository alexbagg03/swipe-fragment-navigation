package com.abagg.swipefragmentnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_red.*


class BlueFragment : NavigationFragment() {

    companion object {
        fun newInstance(): BlueFragment {
            return BlueFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        colorButton.setOnClickListener { hostNavigationListener?.pushFragment(RedFragment.newInstance()) }
    }

}

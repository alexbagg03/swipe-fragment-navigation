package com.abagg.swipefragmentnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_green.*
import kotlinx.android.synthetic.main.fragment_red.*


class GreenFragment : NavigationFragment() {

    companion object {
        fun newInstance(): GreenFragment {
            return GreenFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_green, container, false)
    }

    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(rootView, savedInstanceState)

        backButton.setOnClickListener { hostNavigationListener?.popFragment() }
    }

}

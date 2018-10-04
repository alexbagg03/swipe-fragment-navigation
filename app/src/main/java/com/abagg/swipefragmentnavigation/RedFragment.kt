package com.abagg.swipefragmentnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_red.*


class RedFragment : NavigationFragment() {

    companion object {
        fun newInstance(): RedFragment {
            return RedFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_red, container, false)
    }

    override fun onViewCreated(rootView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(rootView, savedInstanceState)

        colorButton.setOnClickListener { hostNavigationListener?.pushFragment(GreenFragment.newInstance()) }
    }

}

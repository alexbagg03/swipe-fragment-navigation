package com.abagg.swipefragmentnavigation

import android.content.Context
import android.support.v4.app.Fragment

open class NavigationFragment : Fragment() {

    protected var hostNavigationListener: HostNavigationListener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (context is HostNavigationListener) {
            hostNavigationListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        hostNavigationListener = null
    }

}
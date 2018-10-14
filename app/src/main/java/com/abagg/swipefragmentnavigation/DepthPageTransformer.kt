package com.abagg.swipefragmentnavigation

import android.support.v4.view.ViewPager
import android.view.View

class DepthPageTransformer : ViewPager.PageTransformer {

    private val MIN_SCALE = 0.75f

    override fun transformPage(view: View, position: Float) {
        when {
            position <= 0f -> {
                view.alpha = 1f
                view.translationX = 0f
                view.translationZ = 0f
                view.scaleX = 1f
                view.scaleY = 1f
            }
            position < 1f -> {
                view.alpha = 1f
                view.pivotY = 0.5f * view.height
                view.translationX = view.width * -position
                view.translationZ = -10f

                val scaleFactor = MIN_SCALE + (1 - MIN_SCALE) * (1 - Math.abs(position))
                view.scaleX = scaleFactor
                view.scaleY = scaleFactor
            }
            position == 1f -> view.alpha = 0f
        }
    }

}
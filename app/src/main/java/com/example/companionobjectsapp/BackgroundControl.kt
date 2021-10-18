package com.example.companionobjectsapp

import android.view.View


class BackgroundControl {

    companion object {
        val day = 0
        val night = 1
    }

    fun changeBackground(key:Int, layout: View){
        if(key==0){
            layout.setBackgroundResource(R.drawable.day)
        }else
            layout.setBackgroundResource(R.drawable.night)

    }
}
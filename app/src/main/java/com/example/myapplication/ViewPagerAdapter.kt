/*
 * Copyright (c) 2021 syahbudinhamwar.All Rights Reserved
 */

package com.example.myapplication

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(private val mContext: Context, fm:FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment.newInstance()
        } else if (position == 1) {
            SecondFragment.newInstance()
        } else if (position == 2){
            ThirdFragment.newInstance()
        } else{
            FourthFragment.newInstance()
        }
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }
    override fun getCount(): Int {
        return 4
    }
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1,
            R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4)

    }
}
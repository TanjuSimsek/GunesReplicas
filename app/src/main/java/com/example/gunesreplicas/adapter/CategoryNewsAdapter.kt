package com.example.gunesreplicas.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class CategoryNewsAdapter(
    fragmentManager: FragmentManager,
    private val newsFragmentList: List<Fragment>
) : FragmentStatePagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getItem(position: Int): Fragment = newsFragmentList[position]

    override fun getCount(): Int = newsFragmentList.size
}
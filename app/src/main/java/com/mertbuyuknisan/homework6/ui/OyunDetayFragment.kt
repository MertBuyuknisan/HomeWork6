package com.mertbuyuknisan.homework6.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mertbuyuknisan.homework6.R
import com.mertbuyuknisan.homework6.databinding.FragmentOyunDetayBinding
import com.mertbuyuknisan.homework6.databinding.FragmentUygulamalarBinding

class OyunDetayFragment : Fragment() {
    private lateinit var binding: FragmentOyunDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentOyunDetayBinding.inflate(inflater,container,false)









        return binding.root
    }

}
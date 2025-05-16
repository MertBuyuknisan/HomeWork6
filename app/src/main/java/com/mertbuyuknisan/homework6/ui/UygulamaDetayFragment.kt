package com.mertbuyuknisan.homework6.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mertbuyuknisan.homework6.R
import com.mertbuyuknisan.homework6.databinding.FragmentUygulamaDetayBinding
import com.mertbuyuknisan.homework6.databinding.FragmentUygulamalarBinding

class UygulamaDetayFragment : Fragment() {
private lateinit var binding: FragmentUygulamaDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentUygulamaDetayBinding.inflate(inflater,container,false)






        return binding.root
    }

}
package com.example.myresumeapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myresumeapplication.MainActivity
import com.example.myresumeapplication.databinding.FragmentLandingBinding


class LandingFragment : Fragment() {

    private lateinit var binding: FragmentLandingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLandingBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.moreButton.setOnClickListener {
            findNavController().navigate(LandingFragmentDirections.actionLandingFragmentToBaseFragment())
        }
    }

//    fun activityCast(): MainActivity {
//        return activity as MainActivity
//    }

}
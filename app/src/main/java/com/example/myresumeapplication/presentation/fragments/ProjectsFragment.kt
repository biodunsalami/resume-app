package com.example.myresumeapplication.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myresumeapplication.R
import com.example.myresumeapplication.databinding.FragmentProjectsBinding


class ProjectsFragment : Fragment() {

    private lateinit var binding: FragmentProjectsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProjectsBinding.inflate(inflater, container, false)


        return binding.root
    }


}
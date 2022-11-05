package com.example.myresumeapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.myresumeapplication.R
import com.example.myresumeapplication.databinding.FragmentBaseBinding


class BaseFragment : Fragment() {

    private lateinit var binding: FragmentBaseBinding

    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBaseBinding.inflate(inflater, container, false)

        setupBottomNavWithNavigationController()

        return binding.root
    }


    private fun setupBottomNavWithNavigationController() {
        val navHostFragment: NavHostFragment =
            childFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        val graph: NavGraph = inflater.inflate(R.navigation.bottom_nav_graph)

        navController = navHostFragment.navController

        graph.let { navController.graph = it }
        binding.bottomNav.setupWithNavController(navController)


    }

}
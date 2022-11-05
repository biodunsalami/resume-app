package com.example.myresumeapplication.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myresumeapplication.R
import com.example.myresumeapplication.adapter.Data
import com.example.myresumeapplication.databinding.FragmentContactBinding


class ContactFragment : Fragment() {

    private lateinit var binding: FragmentContactBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentContactBinding.inflate(inflater, container, false)

        binding.name.text = getString(R.string.name, Data.user.firstName, Data.user.lastName)
        binding.profession.text = Data.user.profession
        binding.email.text = Data.user.email

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.github.setOnClickListener {
            openLink("https://github.com/biodunsalami")
        }

        binding.linkedin.setOnClickListener {
            openLink("https://www.linkedin.com/in/biodunsalami/")
        }

        binding.twitter.setOnClickListener {
            openLink("https://twitter.com/Ayinlathedev")
        }

    }

    private fun openLink(link: String){
        val uri = Uri.parse(link)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }


}
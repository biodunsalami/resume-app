package com.example.myresumeapplication.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myresumeapplication.R
import com.example.myresumeapplication.adapter.BaseAdapter
import com.example.myresumeapplication.data.Data
import com.example.myresumeapplication.databinding.*
import com.example.myresumeapplication.models.Education
import com.example.myresumeapplication.models.Internship
import com.example.myresumeapplication.models.WorkExperience


class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpSkillsRv()
        setUpExperienceRv()
        setUpInternshipRv()
        setUpEducationRv()

    }


    private fun setUpSkillsRv() {

        val iAdapter = BaseAdapter<String>()

        iAdapter.listOfItems = Data.skills

        iAdapter.expressionViewHolderBinding = { item, viewBinding ->
            val binding = viewBinding as ItemSkillsRecyclerBinding

            binding.skillTextView.text = item
        }

        iAdapter.expressionOnCreateViewHolder = { viewGroup ->
            ItemSkillsRecyclerBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        }

        binding.skillsRecyclerView.apply {
            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.HORIZONTAL)
            adapter = iAdapter
            isNestedScrollingEnabled = false

        }

    }


    private fun setUpExperienceRv() {

        //Initiate the adapter with type
        val mAdapter = BaseAdapter<WorkExperience>()

        //Sample data
        mAdapter.listOfItems = Data.workExperiences

        mAdapter.expressionViewHolderBinding = { item, viewBinding ->
            val binding = viewBinding as ItemExperienceRecyclerBinding

            binding.organizationTextView.text =
                getString(R.string.organization, item.organization, item.city)
            binding.positionTextView.text = item.position
            binding.duration.text = getString(R.string.duration, item.startDate, item.endDate)


        }

        //Inflate the layout and send it to the adapter
        mAdapter.expressionOnCreateViewHolder = { viewGroup ->
            ItemExperienceRecyclerBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        }

        binding.experienceRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = mAdapter
            isNestedScrollingEnabled = false
        }

    }


    private fun setUpInternshipRv() {

        val iAdapter = BaseAdapter<Internship>()

        iAdapter.listOfItems = Data.internships

        iAdapter.expressionViewHolderBinding = { item, viewBinding ->
            val binding = viewBinding as ItemIntenshipsRecyclerBinding

            binding.positionTextView.text =
                getString(R.string.internship_info, item.position, item.organization)
            binding.duration.text = getString(R.string.duration, item.startDate, item.endDate)
        }

        iAdapter.expressionOnCreateViewHolder = { viewGroup ->
            ItemIntenshipsRecyclerBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        }

        binding.internshipsRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = iAdapter
            isNestedScrollingEnabled = false

        }

    }


    private fun setUpEducationRv() {

        val iAdapter = BaseAdapter<Education>()

        iAdapter.listOfItems = Data.education

        iAdapter.expressionViewHolderBinding = { item, viewBinding ->
            val binding = viewBinding as ItemEducationRecyclerBinding

            binding.educationInfoTextView.text = getString(
                R.string.education_info, item.degree,
                item.course, item.institution, item.city
            )
            binding.duration.text = getString(R.string.duration, item.startDate, item.endDate)
        }

        iAdapter.expressionOnCreateViewHolder = { viewGroup ->
            ItemEducationRecyclerBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            )
        }

        binding.educationRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = iAdapter
            isNestedScrollingEnabled = false

        }

    }


}
package com.example.myresumeapplication.data

import com.example.myresumeapplication.models.Education
import com.example.myresumeapplication.models.Internship
import com.example.myresumeapplication.models.User
import com.example.myresumeapplication.models.WorkExperience

object Data {

    val user = User("Abiodun", "Salami", "Android Developer", "abiodunslam@gmail.com")

    val skills = arrayListOf("Kotlin", "Android SDK", "XML", "Git", "Dagger-Hilt", "MVVM", "Firebase")

    val workExperiences = arrayListOf(
        WorkExperience("Infibranches Technologies", "Android Developer", "Lagos", "Sep 2022", "present"),
        WorkExperience("Concrete Communications Ltd", "Android Developer", "Lagos", "Jan 2021", "Sep 2022")
    )

    val education = arrayListOf(
        Education("Mathematics", "University of Ibadan", "Ibadan", "Bsc.", "March 2016", "July 2019")
    )

    val internships = arrayListOf(
        Internship("Android Developer Intern","Google Africa Developer Scholarship", "July 2021", "Dec 2021"),
        Internship("Android Developer Intern","Zuri Team Inc.", "May 2021", "Aug 2021")
    )



}
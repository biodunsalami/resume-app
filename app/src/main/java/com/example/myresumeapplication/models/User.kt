package com.example.myresumeapplication.models

data class User(
    val firstName: String,
    val lastName: String,
    val profession: String,
    val email: String,
    val photo: String = ""

)

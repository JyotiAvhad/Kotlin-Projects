package com.example.neostore.view.model

data class LoginResponse(

    val status: Int,
    val data: LoginUserDataInput,
    val message: String,
    val user_msg: String

)

data class LoginUserDataInput(

    val id: Int,
    val role_id: Int,
    val first_name: String,
    val last_name: String,
    val email: String,
    val username: String,
    val profile_pic: String,
    val country_id: String,
    val gender: String,
    val phone_no: String,
    val dob: String,
    val is_active: Boolean,
    val created: String,
    val modified: String,
    val access_token: String

)

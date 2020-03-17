package com.example.neostore.api

import com.example.neostore.models.LoginResponse
import com.example.neostore.models.RegisterResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiInterface {

    //login user
    @FormUrlEncoded
    @POST("login")
    fun loginUser(

        @Field("email") email: String,
        @Field("password") password: String

    ): Call<LoginResponse>


    @FormUrlEncoded
    @POST("register")
    fun registerUser(

        @Field("first_name") first_name: String,
        @Field("last_name") last_name: String,
        @Field("email") email: String,
        @Field("password") reg_password: String,
        @Field("confirm_password") confirm_password: String,
        @Field("gender") gender: String,
        @Field("phone_no") phone_no: String

    ): Call<RegisterResponse>


}
package com.example.internship.myapplication2;

import com.example.internship.myapplication2.model.DairySiteAssessment;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ResponseService {

    @Headers({"Content-Type: application/x-www-form-urlencoded"})
    @POST("CreateDairyAssessment")
    Call<JsonObject> InsertDairyAssessment(@Body DairySiteAssessment Assessment);
}

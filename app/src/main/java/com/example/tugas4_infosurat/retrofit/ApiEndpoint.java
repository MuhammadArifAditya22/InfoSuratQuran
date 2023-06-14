package com.example.tugas4_infosurat.retrofit;


import com.example.tugas4_infosurat.InfoSurah.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("chapters/?language=id")
    Call<Response> getSurah();
}

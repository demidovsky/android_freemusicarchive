package com.example.ddemidovskiy.fma;

import com.example.ddemidovskiy.fma.albums.Albums;
import com.example.ddemidovskiy.fma.artists.Artists;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ddemidovskiy on 19.09.2016.
 */




public interface FmaService {

    // https://freemusicarchive.org/api/get/{dataset}.{format}?api_key={yourkey}
    // https://freemusicarchive.org/api/get/artists.json?api_key=SM8RACT0OT76MKD4

    @GET("/api/get/artists.json")
    Call<Artists> artists(
        @Query("key") String api_key,
        @Query("limit") int limit
    );



    @GET("/api/get/albums.json")
    Call<Albums> albums(
            @Query("key") String api_key,
            @Query("limit") int limit
    );



}


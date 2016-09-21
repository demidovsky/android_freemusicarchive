package com.example.ddemidovskiy.fma;

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
        //@Query("dataset") String dataset,   // что запрашиваем
        //@Query("format") String format,     // json/xml
        @Query("key") String api_key        // ключ
    );


}
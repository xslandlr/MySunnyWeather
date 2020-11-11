package com.xsl.mysunnyweather.logic.network

import com.xsl.mysunnyweather.MyApplication
import com.xsl.mysunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @Description:     java类作用描述
 * @CreateDate:     2020/11/11 10:38
 * @Author:         Fiora
 */
interface PlaceService {

    @GET("v2/place?token=${MyApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query")query: String) : Call<PlaceResponse>
}
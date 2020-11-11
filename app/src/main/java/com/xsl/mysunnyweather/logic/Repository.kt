package com.xsl.mysunnyweather.logic

import androidx.lifecycle.liveData
import com.xsl.mysunnyweather.logic.network.WeatherNetWork
import kotlinx.coroutines.Dispatchers
import com.xsl.mysunnyweather.logic.model.Place


/**
 * @Description:     java类作用描述
 * @CreateDate:     2020/11/11 11:18
 * @Author:         Fiora
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = WeatherNetWork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e: Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result as Result<List<Place>>)
    }
}
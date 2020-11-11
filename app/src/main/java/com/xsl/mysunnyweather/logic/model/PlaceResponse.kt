package com.xsl.mysunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @Description:     java类作用描述
 * @CreateDate:     2020/11/11 10:34
 * @Author:         Fiora
 */
data class PlaceResponse (val status: String,val places: List<Place>)

data class Place(val name: String,val location: Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String,val lat: String)
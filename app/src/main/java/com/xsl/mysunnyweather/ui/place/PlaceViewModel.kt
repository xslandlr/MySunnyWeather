package com.xsl.mysunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.xsl.mysunnyweather.logic.Repository
import com.xsl.mysunnyweather.logic.model.Place

/**
 * @Description:     java类作用描述
 * @CreateDate:     2020/11/11 11:30
 * @Author:         Fiora
 */
class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun  searchPlaces(query: String){
        searchLiveData.value = query
    }
}
package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.sunnyweather.android.logic.Respository
import com.sunnyweather.android.logic.dao.PlaceDao
import com.sunnyweather.android.logic.model.Place

class PlaceViewModel {
    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()
    val placeLiveData = Transformations.switchMap(searchLiveData){
        query -> Respository.searchPlaces(query)
    }
    fun searchPlaces(query: String){
        searchLiveData.value = query
    }
    fun savePlace(place: Place) = Respository.savePlace(place)
    fun getSavedPlace() = Respository.getSavedPlace()
    fun isPlaceSaved() = Respository.isPlaceSaved()
}
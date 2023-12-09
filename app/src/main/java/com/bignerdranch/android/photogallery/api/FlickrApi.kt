package com.bignerdranch.android.photogallery.api


import retrofit2.http.GET
import retrofit2.Call

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
        "&api_key=5a4250715f31fbb3d877d72ff70351d3" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}
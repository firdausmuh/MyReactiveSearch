package com.firdaus.myreactivesearch.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(
    @field:SerializedName("layers")
    val features: List<PlacesItem>
)

package com.abapps.data.datasource.remote

import com.abapps.data.response.CatResponse
import com.abapps.presentation.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface CatService {

    @GET(Constants.END_POINT)
    suspend fun fetchCats(
        @Query("limit") limit: Int
    ): CatResponse
}
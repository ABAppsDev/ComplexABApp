package com.abapps.domain.repository

import com.abapps.data.datasource.remote.CatService
import com.abapps.data.response.CatResponse
import com.abapps.presentation.utils.Resource
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val catService: CatService
) {
    suspend fun fetchCats(
        limit: Int
    ): Resource<CatResponse> {
        return try {
            val result = catService.fetchCats(limit = limit)
            Resource.Success(data = result)
        } catch (e: Exception) {
            Resource.Error(e.message.toString())
        }
    }
}
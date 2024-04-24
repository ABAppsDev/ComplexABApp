package com.abapps.presentation.utils

import com.abapps.data.model.CatItem


data class MainState(
    val isLoading: Boolean = false,
    val data: ArrayList<CatItem> = ArrayList(),
    val error: String = ""
)

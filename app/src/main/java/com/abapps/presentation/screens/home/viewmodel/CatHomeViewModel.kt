package com.abapps.presentation.screens.home.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abapps.domain.repository.HomeRepository
import com.abapps.data.response.CatResponse
import com.abapps.presentation.utils.Constants
import com.abapps.presentation.utils.MainState
import com.abapps.presentation.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CatHomeViewModel @Inject constructor(
    private val repository: HomeRepository
) : ViewModel() {

    private val _cats: MutableLiveData<CatResponse?> = MutableLiveData()
    private val cats: LiveData<CatResponse?> get() = _cats

    private val _error: MutableLiveData<String> = MutableLiveData()
    val error: LiveData<String> get() = _error

    val listCats: MutableState<MainState> = mutableStateOf(MainState())

    fun fetchCats() {
        viewModelScope.launch {
            listCats.value = MainState(isLoading = true)
            try {

                when (val result = repository.fetchCats(Constants.LIMIT)) {
                    is Resource.Error -> {
                        listCats.value = MainState(error = "Something went wrong")
                    }

                    is Resource.Success -> {
                        result.data?.let {
                            listCats.value = MainState(data = it)
                        }

                    }

                    is Resource.Loading -> {
                        listCats.value = MainState(isLoading = true)
                    }
//                    else -> {}
                }
            } catch (e: Exception) {
                listCats.value = MainState(error = "Something went wrong")
            }
        }
    }

}
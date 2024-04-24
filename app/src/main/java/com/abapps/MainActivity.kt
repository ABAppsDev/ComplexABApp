package com.abapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.abapps.presentation.screens.home.HomePost
import com.abapps.presentation.screens.home.viewmodel.CatHomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val catHomeViewModel: CatHomeViewModel by viewModels()
        setContent {
            HomePost(catHomeViewModel = catHomeViewModel)
            catHomeViewModel.fetchCats()
        }
    }
}

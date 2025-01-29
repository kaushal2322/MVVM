package com.example.mvvm.View

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.example.mvvm.ViewModel.HomeViewmodel


@Composable
fun Homepage(modifier: Modifier=Modifier,viewModel:HomeViewmodel) {
    val userData = viewModel.userData.observeAsState()

    Column {
        Button(onClick = {
            viewModel.getuserdata()

        }) {
            Text(text = "GET DATA")

        }
        userData.value?.let {
            Text(text = it.name)
            Text(text = it.age.toString())
        }

    }

}
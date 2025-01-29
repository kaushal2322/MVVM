package com.example.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.View.Homepage
import com.example.mvvm.ViewModel.HomeViewmodel
import com.example.mvvm.ui.theme.MvvMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val HomeViewmodel = ViewModelProvider(this).get(HomeViewmodel::class.java)
        setContent {
            MvvMTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Homepage(modifier = Modifier.padding(16.dp),HomeViewmodel )
                }
            }
        }
    }
}


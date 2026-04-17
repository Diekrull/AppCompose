package com.periodization.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import com.periodization.myapplication.data.local.UserLocalDataSource
import com.periodization.myapplication.data.remote.UserRemoteDataSource
import com.periodization.myapplication.data.repository.UserRepositoryImpl
import com.periodization.myapplication.domain.usecase.user.GetUserUseCase
import com.periodization.myapplication.presentation.user.UserScreen
import com.periodization.myapplication.presentation.user.UserViewModel


// El MainActivity nos permite ver la pantalla (Si, cada pantalla es un Activity y debe declararse en el Manifest). Y también
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val remoteDataSource = UserRemoteDataSource()
        val localDataSource = UserLocalDataSource()
        val repository = UserRepositoryImpl(
            remoteDataSource = remoteDataSource,
            localDataSource = localDataSource
        )
        val getUserUseCase = GetUserUseCase(repository)
        val viewModel = UserViewModel(getUserUseCase)

        setContent {
            MaterialTheme {
                UserScreen(viewModel = viewModel)
            }
        }
    }
}
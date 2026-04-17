package com.periodization.myapplication.presentation.user

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Esta es la pantalla. Muestra estado y dispara eventos que vienen del ViewModel en este caso, UserViewModel. Está como ven con Compose, así manejamos directamente como queremos que se vea la pantalla.


@Composable
fun UserScreen(
    viewModel: UserViewModel
) {
    val state by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadUser()
    }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            when {
                state.isLoading -> {
                    Text("Cargando usuario...")
                }

                state.error != null -> {
                    Text(
                        text = state.error ?: "",
                        color = MaterialTheme.colorScheme.error
                    )
                }

                else -> {
                    Text(
                        text = "Nombre: ${state.name}",
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Text(
                        text = "Edad: ${state.age}",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(top = 8.dp)
                    )

                    Button(
                        onClick = { viewModel.loadUser() },
                        modifier = Modifier.padding(top = 20.dp)
                    ) {
                        Text("Recargar")
                    }
                }
            }
        }
    }
}
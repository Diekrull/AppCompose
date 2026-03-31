package com.periodization.myapplication

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import android.widget.Toast
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MaterialTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "entrada"
    ) {
        composable("entrada") {
            PantallaEntrada(
                onContinuar = { nombre ->
                    val nombreSeguro = Uri.encode(nombre)
                    navController.navigate("resultado/$nombreSeguro")
                }
            )
        }

        composable(
            route = "resultado/{nombre}",
            arguments = listOf(
                navArgument("nombre") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: "Usuario"

            PantallaResultado(
                nombre = nombre,
                onVolver = { navController.popBackStack() }
            )
        }
    }
}

@Composable
fun PantallaEntrada(
    onContinuar: (String) -> Unit
) {
    var nombre by remember { mutableStateOf("") }
    val context = LocalContext.current

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Ingresa tu nombre") },
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = {
                    if (nombre.trim().isEmpty()) {
                        Toast.makeText(
                            context,
                            "Por favor ingresa tu nombre",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        onContinuar(nombre.trim())
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
            ) {
                Text("Continuar")
            }
        }
    }
}

@Composable
fun PantallaResultado(
    nombre: String,
    onVolver: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hola, $nombre",
                style = MaterialTheme.typography.headlineMedium
            )

            Button(
                onClick = onVolver,
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Text("Volver")
            }
        }
    }
}
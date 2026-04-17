package com.periodization.myapplication.presentation.saludo

data class SaludoState(
    val nombre: String = "",
    val edad: String = "",
    val mensaje: String = "",
    val error: String? = null
)
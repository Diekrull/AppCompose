package com.periodization.myapplication.presentation.user

// Representa El estado de la pantalla.

data class UserUiState(
    val name: String = "",
    val age: String = "",
    val isLoading: Boolean = false,
    val error: String? = null
)
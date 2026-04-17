package com.periodization.myapplication.presentation.user

import androidx.lifecycle.ViewModel
import com.periodization.myapplication.domain.usecase.user.GetUserUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// El ViewModel como les comentaba en la clase, nos permite conectar la UI (Intefaz de Usuario) con el dominio (los datos que obtenemos de la capa de dominio).


class UserViewModel(
    private val getUserUseCase: GetUserUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(UserUiState())
    val uiState: StateFlow<UserUiState> = _uiState.asStateFlow()

    fun loadUser() {
        _uiState.value = _uiState.value.copy(isLoading = true, error = null)

        try {
            val user = getUserUseCase()

            _uiState.value = UserUiState(
                name = user.name,
                age = user.age.toString(),
                isLoading = false,
                error = null
            )
        } catch (e: Exception) {
            _uiState.value = _uiState.value.copy(
                isLoading = false,
                error = "Error al cargar usuario"
            )
        }
    }
}
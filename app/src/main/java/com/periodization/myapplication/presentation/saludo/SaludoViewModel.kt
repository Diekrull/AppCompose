package com.periodization.myapplication.presentation.saludo

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SaludoViewModel : ViewModel() {

    private val _state = MutableStateFlow(SaludoState())
    val state: StateFlow<SaludoState> = _state

    fun onNombreChange(nombre: String) {
        _state.value = _state.value.copy(nombre = nombre)
    }

    fun onEdadChange(edad: String) {
        _state.value = _state.value.copy(edad = edad)
    }

    fun onContinuar() {
        val nombre = _state.value.nombre.trim()
        val edadTexto = _state.value.edad.trim()

        if (nombre.isEmpty()) {
            _state.value = _state.value.copy(error = "Ingresa tu nombre")
            return
        }

        val edad = edadTexto.toIntOrNull()
        if (edad == null || edad <= 0) {
            _state.value = _state.value.copy(error = "Edad inválida")
            return
        }

        val mensaje = "Hola, $nombre, tienes $edad años"

        _state.value = _state.value.copy(
            mensaje = mensaje,
            error = null
        )
    }
}
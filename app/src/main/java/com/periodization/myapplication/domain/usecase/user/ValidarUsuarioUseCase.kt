package com.periodization.myapplication.domain.usecase.user

class ValidarUsuarioUseCase {
    fun execute(nombre: String, edad: String): String? {
        if (nombre.isBlank()) return "El nombre está vacío"

        val edadInt = edad.toIntOrNull()
        if (edadInt == null || edadInt <= 0) return "Edad inválida"

        return null
    }
}
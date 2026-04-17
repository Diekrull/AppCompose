package com.periodization.myapplication.data.model

// DTO (Data Transfer Object)
// Representa los datos tal como vienen desde una fuente externa (por ejemplo, una API).
// Este modelo NO se usa directamente en la lógica de negocio.
// Puede cambiar si el backend cambia su formato.
//
// Ejemplo:
// API → { fullName: "Gianfranco", years: 30 }
// El DTO es lo que manda el backend, no lo que usa la app.

data class UserDto(
    val fullName: String,
    val years: Int
)
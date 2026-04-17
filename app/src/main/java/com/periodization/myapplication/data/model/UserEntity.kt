package com.periodization.myapplication.data.model

// Entity
// Representa cómo se almacenan los datos en la base de datos local (Room).
// Este modelo está optimizado para persistencia, no para lógica de negocio.
// Puede tener nombres o estructura distinta al modelo de dominio.
//
// Ejemplo:
// DB → nameStored, ageStored
//La Entity es cómo guardo los datos, no cómo los uso.

data class UserEntity(
    val nameStored: String,
    val ageStored: Int
)
package com.periodization.myapplication.data.mapper

import com.periodization.myapplication.data.model.UserDto
import com.periodization.myapplication.data.model.UserEntity
import com.periodization.myapplication.domain.model.User

// El mapper convierte datos externos (API o base de datos) en modelos que usa la lógica de negocio.
// El mapper no sabe de dónde vienen los datos. Solo sabe cómo transformarlos.”
// Ejemplo:
// API: { fullName: "Gianfranco", years: 30 }
// Domain: User(name="Gianfranco", age=30)
fun UserDto.toDomain(): User {
    return User(
        name = fullName,
        age = years
    )
}

fun UserEntity.toDomain(): User {
    return User(
        name = nameStored,
        age = ageStored
    )
}
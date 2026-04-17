package com.periodization.myapplication.domain.usecase.user

import com.periodization.myapplication.domain.model.User
import com.periodization.myapplication.domain.repository.UserRepository

// UseCase
// Representa una acción de negocio específica de la aplicación.
// Encapsula lógica de negocio y orquesta el uso del repository.
//
// No depende de Android ni de la UI.
// Es reutilizable y fácil de testear.
//
// Ejemplo: obtener un usuario

class GetUserUseCase(
    private val repository: UserRepository
) {
    operator fun invoke(): User {
        return repository.getUser()
    }
}
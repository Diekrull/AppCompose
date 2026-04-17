package com.periodization.myapplication.data.remote

import com.periodization.myapplication.data.model.UserDto

// RemoteDataSource
// Se encarga de obtener datos desde una fuente remota (API).
// Aquí viviría Retrofit o llamadas HTTP en un proyecto real.
// NO contiene lógica de negocio, solo obtiene datos externos.
//
// Retorna DTOs, no modelos de dominio.
// El RemoteDataSource habla con internet.
class UserRemoteDataSource {
    fun fetchUser(): UserDto {
        return UserDto(
            fullName = "Gianfranco Remote",
            years = 30
        )
    }
}
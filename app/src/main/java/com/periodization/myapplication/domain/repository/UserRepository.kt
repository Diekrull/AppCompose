package com.periodization.myapplication.domain.repository

import com.periodization.myapplication.domain.model.User

// Repository (interface - dominio)
// Define el contrato de datos que necesita la aplicación.
// NO especifica cómo se obtienen los datos (API, base de datos, cache, etc).
// El dominio depende de esta interfaz, no de implementaciones concretas.
// Esto permite desacoplar la lógica del negocio de la infraestructura.
interface UserRepository {
    fun getUser(): User
}
package com.periodization.myapplication.data.repository

import com.periodization.myapplication.domain.model.User
import com.periodization.myapplication.domain.repository.UsuarioRepository


/* Ejemplo Sustitución de Liskov correcta */

class RemoteUsuarioRepository : UsuarioRepository {
    override fun obtenerUsuario(): User {
        return User("Gianfranco", 30)
    }
}
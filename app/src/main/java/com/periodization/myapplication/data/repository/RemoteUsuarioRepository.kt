package com.periodization.myapplication.data.repository

import com.periodization.myapplication.domain.model.Usuario
import com.periodization.myapplication.domain.repository.UsuarioRepository


/* Ejemplo Sustitución de Liskov correcta */

class RemoteUsuarioRepository : UsuarioRepository {
    override fun obtenerUsuario(): Usuario {
        return Usuario("Gianfranco", 30)
    }
}
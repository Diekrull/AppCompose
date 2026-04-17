package com.periodization.myapplication.domain.model


/* D — Dependency Inversion Principle
Se debe depender de abstracciones, no de implementaciones concretas.”
*/


/* Ejemplo Código Erróneo */

class UsuarioRepositoryImpl {
    fun obtenerUsuario(): String {
        return "Gianfranco"
    }
}

class UsuarioViewModel {
    private val repository = UsuarioRepositoryImpl()

    fun cargarUsuario(): String {
        return repository.obtenerUsuario()
    }
}


/* Ejemplo Código Correcto */

interface UsuarioRepository {
    fun obtenerUsuario(): String
}

class UsuarioRepositoryImpl : UsuarioRepository {
    override fun obtenerUsuario(): String {
        return "Gianfranco"
    }
}

class UsuarioViewModel(
    private val repository: UsuarioRepository
) {
    fun cargarUsuario(): String {
        return repository.obtenerUsuario()
    }
}


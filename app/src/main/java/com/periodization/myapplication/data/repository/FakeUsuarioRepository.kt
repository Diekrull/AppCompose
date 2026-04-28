package com.periodization.myapplication.data.repository

import com.periodization.myapplication.domain.model.User
import com.periodization.myapplication.domain.repository.UsuarioRepository

/*Liskov Substitution Principle (LSP)

Si una clase hija reemplaza a su clase base, el sistema debe seguir funcionando correctamente. Es decir, si algo dice que hace X… debe hacerlo siempre.*/


/* EJ: Sustitución de Liskov Errada : No puede devolver una excepción o un valor nulo
class FakeUsuarioRepository : UsuarioRepository {
    override fun obtenerUsuario(): Usuario {
        throw RuntimeException("No implementado")
    }
}

*/


//EJ: Sustitución de Liskov Correcta : Devuelve un valor válido

class FakeUsuarioRepository : UsuarioRepository {
    override fun obtenerUsuario(): User {
        return User("Fake", 0)
    }
}
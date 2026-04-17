package com.periodization.myapplication.domain.usecase

/* PRINCIPIOS SOLID*/

/*S — Single Responsibility Principle

Una clase debe tener una sola responsabilidad.

Si una clase:

valida datos
formatea texto
guarda en base de datos
llama una API
*/


/* Ejemplo Código Erróneo */

class RegistroUsuarioManager {

    fun registrar(nombre: String, edad: String): String {
        if (nombre.isBlank()) {
            return "El nombre está vacío"
        }

        val edadInt = edad.toIntOrNull()
        if (edadInt == null || edadInt <= 0) {
            return "Edad inválida"
        }

        val mensaje = "Usuario $nombre registrado con $edadInt años"

        println("Guardando usuario en base de datos...")
        println("Enviando correo de bienvenida...")

        return mensaje
    }
}



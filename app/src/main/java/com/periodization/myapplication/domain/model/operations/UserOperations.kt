package com.periodization.myapplication.domain.model.operations

/* I — Interface Segregation Principle
Definición simple

Ninguna clase debe verse obligada a implementar métodos que no necesita.*/

/* Ejemplo Código Erróneo */

interface UserOperations {
    fun crearUsuario()
    fun actualizarUsuario()
    fun eliminarUsuario()
    fun exportarUsuarioPdf()
    fun sincronizarConServidor()
}



/* Ejemplo Código Correcto */

interface CrearUsuario {
    fun crearUsuario()
}

interface ActualizarUsuario {
    fun actualizarUsuario()
}

interface EliminarUsuario {
    fun eliminarUsuario()
}

interface ExportarUsuarioPdf {
    fun exportarUsuarioPdf()
}

interface SincronizarUsuario {
    fun sincronizarConServidor()
}


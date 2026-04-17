package com.periodization.myapplication.domain.usecase.user

class CrearMensajeRegistroUseCase {
    fun execute(nombre: String, edad: Int): String {
        return "Usuario $nombre registrado con $edad años"
    }
}
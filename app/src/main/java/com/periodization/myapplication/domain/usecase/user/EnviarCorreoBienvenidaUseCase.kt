package com.periodization.myapplication.domain.usecase.user

class EnviarCorreoBienvenidaUseCase {
    fun execute(nombre: String) {
        println("Enviando correo de bienvenida a $nombre...")
    }
}
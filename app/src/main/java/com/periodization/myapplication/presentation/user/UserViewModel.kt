package com.periodization.myapplication.presentation.user

class UsuarioViewModel(
    private val repo: UsuarioRepository
) {
    fun cargar(): Usuario {
        return repo.obtenerUsuario()
    }
}
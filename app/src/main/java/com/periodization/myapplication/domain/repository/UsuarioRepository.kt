package com.periodization.myapplication.domain.repository

import com.periodization.myapplication.domain.model.User

interface UsuarioRepository {
    fun obtenerUsuario(): User
}
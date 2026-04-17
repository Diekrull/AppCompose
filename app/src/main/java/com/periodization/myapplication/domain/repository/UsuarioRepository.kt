package com.periodization.myapplication.domain.repository

import com.periodization.myapplication.domain.model.Usuario

interface UsuarioRepository {
    fun obtenerUsuario(): Usuario
}
package com.periodization.myapplication.data.repository

import com.periodization.myapplication.data.local.UserLocalDataSource
import com.periodization.myapplication.data.mapper.toDomain
import com.periodization.myapplication.data.remote.UserRemoteDataSource
import com.periodization.myapplication.domain.model.User
import com.periodization.myapplication.domain.repository.UserRepository

//  Implementación real de UserRemoteDataSource, llamamos a la clase dentro de la implementación y luego la utilizamos para obtener Usuarios (getUser) desde el repositorio.

class UserRepositoryImpl(
    private val remoteDataSource: UserRemoteDataSource,
    private val localDataSource: UserLocalDataSource
) : UserRepository {

    override fun getUser(): User {
        // Ejemplo simple: usamos remoto
        val remoteUser = remoteDataSource.fetchUser()
        return remoteUser.toDomain()

        // Si quisieras usar local:
        // return localDataSource.getCachedUser().toDomain()
    }
}
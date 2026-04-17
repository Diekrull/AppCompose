package com.periodization.myapplication.data.local

import com.periodization.myapplication.data.model.UserEntity

// Nos permite almacenar de manera local los datos del usuario.

class UserLocalDataSource {
    fun getCachedUser(): UserEntity {
        return UserEntity(
            nameStored = "Gianfranco Local",
            ageStored = 29
        )
    }
}
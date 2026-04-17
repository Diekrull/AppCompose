package com.periodization.myapplication.data.mapper

import com.periodization.myapplication.data.model.UserDto
import com.periodization.myapplication.data.model.UserEntity
import com.periodization.myapplication.domain.model.User

// El mapper traduce modelos de data al modelo de dominio.

fun UserDto.toDomain(): User {
    return User(
        name = fullName,
        age = years
    )
}

fun UserEntity.toDomain(): User {
    return User(
        name = nameStored,
        age = ageStored
    )
}
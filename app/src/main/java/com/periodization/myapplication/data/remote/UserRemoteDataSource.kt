package com.periodization.myapplication.data.remote

import com.periodization.myapplication.data.model.UserDto

class UserRemoteDataSource {
    fun fetchUser(): UserDto {
        return UserDto(
            fullName = "Gianfranco Remote",
            years = 30
        )
    }
}
package com.periodization.myapplication.domain.usecase.user

import com.periodization.myapplication.domain.model.User
import com.periodization.myapplication.domain.repository.UserRepository

class GetUserUseCase(
    private val repository: UserRepository
) {
    operator fun invoke(): User {
        return repository.getUser()
    }
}
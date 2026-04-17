package com.periodization.myapplication.domain.repository

import com.periodization.myapplication.domain.model.User

interface UserRepository {
    fun getUser(): User
}
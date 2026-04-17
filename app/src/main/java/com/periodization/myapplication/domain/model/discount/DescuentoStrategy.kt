package com.periodization.myapplication.domain.model.discount

interface DescuentoStrategy {
    fun aplicar(precio: Double): Double
}
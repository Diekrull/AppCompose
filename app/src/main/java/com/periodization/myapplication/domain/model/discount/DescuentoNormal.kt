package com.periodization.myapplication.domain.model.discount

class DescuentoNormal : DescuentoStrategy {
    override fun aplicar(precio: Double): Double = precio
}
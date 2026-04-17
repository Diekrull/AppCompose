package com.periodization.myapplication.domain.model.discount

class DescuentoPremium : DescuentoStrategy {
    override fun aplicar(precio: Double): Double = precio * 0.9
}
package com.periodization.myapplication.domain.model.discount

class DescuentoVip : DescuentoStrategy {
    override fun aplicar(precio: Double): Double = precio * 0.8
}
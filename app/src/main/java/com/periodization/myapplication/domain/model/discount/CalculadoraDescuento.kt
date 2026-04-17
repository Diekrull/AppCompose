package com.periodization.myapplication.domain.model.discount

class CalculadoraDescuento(
    private val descuentoStrategy: DescuentoStrategy
) {
    fun calcular(precio: Double): Double {
        return descuentoStrategy.aplicar(precio)
    }
}
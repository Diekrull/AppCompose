package com.periodization.myapplication.domain.model

/* O — Open/Closed Principle

Las clases deben estar abiertas a extensión, pero cerradas a modificación. */

class CalculadoraDescuento {

    fun calcular(tipoUsuario: String, precio: Double): Double {
        return when (tipoUsuario) {
            "NORMAL" -> precio
            "PREMIUM" -> precio * 0.9
            "VIP" -> precio * 0.8
            else -> precio
        }
    }
}
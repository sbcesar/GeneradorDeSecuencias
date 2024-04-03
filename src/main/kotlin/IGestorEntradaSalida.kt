package org.example

interface IGestorEntradaSalida {
    fun mostrarMensaje(mensaje: String, salto: Boolean)

    fun obtenerEntero(mensaje: String, salto: Boolean): Int
}
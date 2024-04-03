package org.example

interface IGestorEntradaSalida {
    fun mostrarMensaje(mensaje: String, salto: Boolean)

    fun pedirNumero(mensaje: String, salto: Boolean): Int?
}
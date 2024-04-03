package org.example

class GestorConsola : IGestorEntradaSalida{

    override fun mostrarMensaje(mensaje: String, salto: Boolean) {
        if (salto) println(mensaje) else print(mensaje)
    }

    override fun pedirNumero(mensaje: String, salto: Boolean): Int? {
        mostrarMensaje(mensaje,false)
        return readln().toIntOrNull()
    }
}
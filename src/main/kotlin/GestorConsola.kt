package org.example

class GestorConsola : IGestorEntradaSalida{

    override fun mostrarMensaje(mensaje: String, salto: Boolean) {
        if (salto) println(mensaje) else print(mensaje)
    }

    override fun obtenerEntero(mensaje: String, salto: Boolean): Int {
        var numero: Int?
        do {
            mostrarMensaje(mensaje,false)
            numero = readln().toIntOrNull()
        } while (numero == null)

        return numero
    }
}
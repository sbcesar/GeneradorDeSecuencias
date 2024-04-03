package org.example

fun main() {
    val gestorConsola = GestorConsola()
    val generadorSecuencia = GeneradorSecuencias(gestorConsola)

    val numeroDePalabras = gestorConsola.mostrarMensaje("Introduce el numero de palabras: ", true)

    if (numeroDePalabras)
}
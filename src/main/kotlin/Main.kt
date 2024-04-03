package org.example

fun main() {
    val gestorConsola = GestorConsola()
    val generadorSecuencia = GeneradorSecuencias(gestorConsola)
    val menu = Menu(gestorConsola,generadorSecuencia)

    menu.menu()
}
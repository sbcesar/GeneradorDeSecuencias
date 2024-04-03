package org.example

class Menu(
    private val info: IGestorEntradaSalida,
    private val generadorSecuencia: IGeneradorSecuencia
) {

    fun menu() {
        var opcion: Int

        do {
            mostrarMenu()

            opcion = pedirOpcion(0,3)

            when (opcion) {
                1 -> {
                    val numero = info.obtenerEntero("Introduce el numero de palabras que tendra la frase: ",true)
                    generadorSecuencia.fraseIncremental(numero)
                }
                2 -> {
                    val numero = info.obtenerEntero("Introduce el numero de palabras que tendra la frase: ",true)
                    generadorSecuencia.fraseFinal(numero)
                }
                3 -> {
                    break
                }
                else -> {
                    info.mostrarMensaje("*** ERROR *** Elige una opcion valida pofavo.", true)
                }
            }

        } while (opcion != 0)
    }

    private fun mostrarMenu() {
        info.mostrarMensaje("Generador de Secuencias:", true)
        info.mostrarMensaje(">>Mostrar frase incrementada",true)
        info.mostrarMensaje(">>Mostrar frase final:",true)
        info.mostrarMensaje(">>Salir",true)
    }

    private fun pedirOpcion(min: Int, max: Int): Int {
        var opcion: Int?

        do {
            opcion = info.obtenerEntero("Ingrese una opcion: ",true)
        } while (opcion == null || opcion < min || opcion > max)

        return opcion
    }
}
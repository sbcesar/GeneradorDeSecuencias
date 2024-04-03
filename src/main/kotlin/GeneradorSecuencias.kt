package org.example

class GeneradorSecuencias(
    val info: IGestorEntradaSalida
) :IGeneradorSecuencia {
    override lateinit var sec: Sequence<String>

    override fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readlnOrNull() }.constrainOnce().take(limit)

    fun fraseIncremental(numPalabras: Int) {
        sec = lineSequence(numPalabras)

        var frase = ""

        frase += sec.forEach { palabra ->
            if (frase.isEmpty()) palabra else " $palabra"

        }

        info.mostrarMensaje(frase, false)
    }

    fun fraseFinal() {

    }

    fun getSec() {

    }

    fun mostrarSec() {

    }
}
package org.example

class GeneradorSecuencias(
    private val info: IGestorEntradaSalida
) :IGeneradorSecuencia {
    override lateinit var sec: Sequence<String>

    override fun lineSequence(limit: Int) = generateSequence { readlnOrNull() }.constrainOnce().take(limit)

    override fun fraseIncremental(numPalabras: Int) {
        sec = lineSequence(numPalabras)

        var frase = ""

        sec.forEachIndexed { index, palabra ->
            frase += if (index == 0) palabra else " $palabra"
            info.mostrarMensaje(frase, true)
        }
    }

    override fun fraseFinal(numPalabras: Int) {
        sec = lineSequence(numPalabras)

        var frase = ""

        sec.forEach { palabra ->
            frase += if (frase.isEmpty()) palabra else " $palabra"
        }

        info.mostrarMensaje(frase,true)
    }

    override fun getSec(): String {
        return sec.joinToString { " " }
    }

    override fun mostrarSec() {
        info.mostrarMensaje(getSec(), false)
    }
}
package org.example

interface IGeneradorSecuencia {
    var sec: Sequence<String>

    fun lineSequence(limit: Int = Int.MAX_VALUE): Sequence<String>

    fun fraseIncremental(numPalabras: Int)

    fun fraseFinal(numPalabras: Int)

    fun getSec(): String

    fun mostrarSec()
}
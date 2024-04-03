package org.example

interface IGeneradorSecuencia {
    var sec: Sequence<String>

    fun lineSequence(limit: Int = Int.MAX_VALUE): Sequence<String>
}
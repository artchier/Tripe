package br.digital.com

class Tripe(var dobrado: Boolean,
            val alturaMin: Int,
            val alturaMax: Int,
            var alturaAtual: Int) {

    init {
        println("Tripé\nDobrado: $dobrado\tAltura mínima: $alturaMin\tAltura atual: $alturaAtual\tAltura máxima: $alturaMax")
    }

    fun definirAltura(novaAltura: Int): Int{
        alturaAtual = novaAltura

        return alturaAtual
    }

    fun dobrar(){
        dobrado = true
    }

    fun desdobrar(){
        dobrado = false
    }

    fun guardar(){
        dobrado = true
        alturaAtual = alturaMin
    }

    fun prontoParaGuardar(): Boolean{
        return (dobrado && alturaAtual == alturaMin)
    }

    fun usar(){
        dobrado = false
        alturaAtual = (alturaMax/2) + 1
    }

    fun prontoParaUsar(): Boolean{
        return (!dobrado && alturaAtual >= alturaMax/2)
    }
}
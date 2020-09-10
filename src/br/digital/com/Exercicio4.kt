package br.digital.com

fun main(){
    val tripe = Tripe(true, 1, 3, 1)

    println("O tripé está pronto para uso? "+tripe.prontoParaUsar())
    println("O tripé está pronto para guardar? "+tripe.prontoParaGuardar())
    tripe.desdobrar()
    println("O tripé está pronto para guardar? "+tripe.prontoParaGuardar())
}
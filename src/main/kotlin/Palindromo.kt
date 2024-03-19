fun main() {
    println("Entre com sua frase, palavra ou numero")
    val frase = readln()

    val invertido = frase.reversed()

    if (frase.equals(invertido)){
        println("$frase e um palindromo")
        return
    }

    println("$frase nao e um palindromo")

}
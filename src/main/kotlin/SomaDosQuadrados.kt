fun main() {
    println("Insira o primeiro numero: ")
    val primeiro = readln().toInt()

    println("Insira o segundo numero: ")
    val segundo = readln().toInt()

    println("Insira o terceiro numero: ")
    val terceiro = readln().toInt()

    val soma = ((primeiro * primeiro) + (segundo * segundo) + (terceiro * terceiro))

    println("O valor da soma dos quadrados de $primeiro, $segundo e $terceiro e igual a: $soma")
}
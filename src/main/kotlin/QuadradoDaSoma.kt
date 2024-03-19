fun main() {
    println("Insira o primeiro numero: ")
    val primeiro = readln().toInt()

    println("Insira o segundo numero: ")
    val segundo = readln().toInt()

    println("Insira o terceiro numero: ")
    val terceiro = readln().toInt()

    val soma = primeiro + segundo + terceiro

    val quadradoDaSoma = soma * soma

    println("O valor do quadrado da soma de $primeiro, $segundo, $terceiro e igual a: $quadradoDaSoma")
}
fun main() {
    println("Informe a quantidade de votos nulos para o candidato A")
    val nuloA = readln().toInt()

    println("Informe a quantidade de votos em branco para o candidato A")
    val brancoA = readln().toInt()

    println("Informe a quantidade de votos validos para o candidato A")
    val validoA = readln().toInt()


    println("Informe a quantidade de votos nulos para o candidato B")
    val nuloB = readln().toInt()

    println("Informe a quantidade de votos em branco para o candidato B")
    val brancoB = readln().toInt()

    println("Informe a quantidade de votos validos para o candidato B")
    val validoB = readln().toInt()


    println("Informe a quantidade de votos nulos para o candidato C")
    val nuloC = readln().toInt()

    println("Informe a quantidade de votos em branco para o candidato C")
    val brancoC = readln().toInt()

    println("Informe a quantidade de votos validos para o candidato C")
    val validoC = readln().toInt()

    val totalBrancos = brancoA + brancoB + brancoC

    val totalNulos = nuloA + nuloB + nuloC

    val totalValidos = validoA + validoB + validoC

    val totalEleitores = totalBrancos + totalValidos + totalNulos

    val percentualTotalValido = (totalValidos.toDouble() * 100) / totalEleitores

    val percentualTotalBranco = (totalBrancos.toDouble() * 100) / totalEleitores

    val percentualTotalNulo = (totalNulos.toDouble() * 100) / totalEleitores

    val percentualA = (validoA.toDouble() * 100) / totalEleitores

    val percentualB = (validoB.toDouble() * 100) / totalEleitores

    val percentualC = (validoC.toDouble() * 100) / totalEleitores

    println("Votos validos em relacao e quantidade de eleitores: $percentualTotalValido")
    println("Votos validos em relacao e quantidade de eleitores do candidato A: $percentualA")
    println("Votos validos em relacao e quantidade de eleitores do candidato B: $percentualB")
    println("Votos validos em relacao e quantidade de eleitores do candidato C: $percentualC")

}
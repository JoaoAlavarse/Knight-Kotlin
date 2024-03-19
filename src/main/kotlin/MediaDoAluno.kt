fun main() {
    println("Insira a primeira nota do aluno")
    val primeira = readln().toDouble()

    println("Insira a segunda nota do aluno")
    val segunda = readln().toDouble()

    println("Insira a terceira nota do aluno")
    val terceira = readln().toDouble()

    println("Insira a quarta nota do aluno")
    val quarta = readln().toDouble()

    val media = (primeira + segunda + terceira + quarta) / 4

    val frase = if (media >= 5) "APROVADO" else "REPROVADO"

    println("Situacao: $frase")
    println("Media: $media")
}
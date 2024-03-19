
fun main() {
    val um = arrayOf("A" , "E", "I", "O", "U", "L", "N", "R", "S", "T")
    val dois = arrayOf("D", "G")
    val tres = arrayOf("B", "C", "M", "P")
    val quatro = arrayOf("F", "H", "V", "W", "Y")
    val cinco = arrayOf("K")
    val oito = arrayOf("J", "X")
    val dez = arrayOf("Q", "Z")
    var soma = 0

    println("Insira a frase")
    var frase = readln()

    frase.forEach {
        soma += when (it.toString().uppercase()){
            in um -> 1
            in dois -> 2
            in tres -> 3
            in quatro -> 4
            in cinco -> 5
            in oito -> 8
            in dez -> 10
            else -> 0
        }
    }

    println("Frase: $frase. Pontos: $soma")
}
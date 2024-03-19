fun main() {
        var fatorial = 1
        println("Insira um numero")
        val numero = readln().toInt()

        for (i in 1..numero){
           fatorial  *= i
        }

        println("O fatorial de $numero e: $fatorial")
}
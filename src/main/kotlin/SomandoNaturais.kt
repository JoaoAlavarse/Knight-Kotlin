fun main() {
    var soma = 0u
    println("Informe o comeco de um intervalo de tempo com no minimo 100 numeros naturais")
    val comeco = readln().toUInt()

    println("Informe o final do intervalo")
    val final = readln().toUInt()

    if ((final - 100u) < comeco ){
        throw IllegalArgumentException("Intervalo insuficiente")
    }

    for (i in comeco..final){
        soma = i + soma
    }

    println("Comeco: $comeco, Fim: $final. Soma total: $soma")
}
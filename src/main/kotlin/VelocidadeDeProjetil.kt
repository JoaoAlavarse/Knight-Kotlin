fun main() {
    println("Informe a distancia percorrida em quilometros")
    val distancia = readln().toDouble()

    println("Informe o tempo necessario para percorrer este trajeto em minutos")
    val tempo = readln().toDouble()

    val velocidade = ((distancia * 1000) / (tempo * 60))

    println("A velocidade em metros por segundo e de: $velocidade m/s")
}
fun main() {
    var array = IntArray(12)

    for (i in array.indices){
        println("Informe o valor que ficara na posicao $i")
        array[i] = readln().toInt()
    }

    println("Array antes de ordenar: ${array.joinToString { it.toString() }}")

    array = array.sortedArrayDescending()

    println("Array depois de ordenar: ${array.joinToString { it.toString() }}")
}
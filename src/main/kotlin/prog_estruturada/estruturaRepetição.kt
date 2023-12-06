package prog_estruturada

fun main() {
    val numeros = mapOf(1 to "banana", 2 to "maça", 3 to "melancia", 4 to "laranja", 5 to "pera")

    var indice = 0
    while (indice < numeros.size) {
        println(numeros[indice])
        indice++
    }

    for ((chave, valor) in numeros) {
     //   println("Chave: $chave, Valor: $valor")
    }

    numeros.forEach { (chave, valor) ->
       // println("Chave: $chave, Valor: $valor")
    }
}

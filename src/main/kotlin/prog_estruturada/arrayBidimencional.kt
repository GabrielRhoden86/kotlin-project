package prog_estruturada

fun main() {

   //imprimindo array multidimencional com array sequenciais int
    val meuArray = arrayOf(
        arrayOf("maçã", "banana", "pera"),
        arrayOf("feijão", "arroz", "milho"),
        arrayOf("leite", "iogurte", "requijão")
    )

    for (i in meuArray.indices) {

        for (j in meuArray[i].indices) {

            print("${meuArray[i][j]} ")
        }
        println()
    }

//imprimindo array multidimencional com array string
    val meuMapa = mapOf(
        "groupA" to listOf("maçã", "banana", "pera"),
        "groupB" to listOf("feijão", "arroz", "milho"),
        "groupC" to listOf("leite", "iogurte", "requijão")
    )

// Para imprimir o mapa
    for ((chave, valor) in meuMapa) {

        println("$chave: ${valor.joinToString(", ")}")
    }


}
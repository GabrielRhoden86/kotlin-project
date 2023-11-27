package br.com.meu_blog
fun main(){

    val avaliacoes = mapOf(
        1 to "ruim",
        2 to "razoável",
        3 to "bom",
        4 to "ótimo",
        5 to "excelente",
        6 to "excelente"
    )

    println("Avaliação para 3: ${avaliacoes[3]}")

        //indice     //valor             //colection
    for ((nota, avaliacao) in avaliacoes) {
        
        println("Nota: $nota, Avaliação: $avaliacao")
    }

}


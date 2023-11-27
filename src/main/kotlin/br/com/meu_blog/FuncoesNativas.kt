package br.com.meu_blog

fun main() {
    //String
    val nome = "Gabriel-N-Rhoden"
    val tamanhoNome = nome.count()
    //println("Tamanho:$tamanhoNome")

    val separaNome = nome.split("-")
    //println("Separe:$separaNome")

    val remove = nome.dropLast(3)
    //println("remove os 3 ultimos:$remove")

    val removeFist = nome.drop(3)
    //println("remove os 3 primeiros:$removeFist")

    val contem = nome.contains("a") //retorna bolean
    // println("Contem:$contem")







}





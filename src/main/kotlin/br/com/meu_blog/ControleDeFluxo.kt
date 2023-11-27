package br.com.meu_blog

//Isso é equivalente ao swicht case embora mais poderoso
fun main(args:Array<String>){

/*    var number = 2
    var resultado = when(number){
        1->"esta é a rota 1"
        2->"esta é a rota 2"
        3->"esta é a rota 3"
        4->"esta é a rota 4"
        5->"esta é a rota 5"
        else->"Outra rota"
    }*/

    //Executando when com condicionais
    val valor = 255
    val resultado = when {
        valor < 10 -> "Menor que 10"
        valor in 10..20 -> "Entre 10 e 20"
        valor > 20 && valor < 30 -> "Entre 20 e 30"
        else -> "Outro caso"
    }

    println(resultado)

}
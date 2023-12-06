package prog_estruturada

//Quando usar this. no kotlin
class Exemplo {
    var x = 5  //this. serve pro sistema entender que estou usando esse x e não o do parametro da função
    fun definirX(x: Int) {
      //  this.x = x  // Quan 'this.x' se refere à propriedade da classe, e 'x' se refere ao parâmetro da função.
        println("O valor do parâmetro x é: $x")
    }
    fun definirY(x: Int) {

        println("O valor da variavel x é:${this.x} ")
    }

}
fun main(args:Array<String>) {

    val exemplo01 = Exemplo();

    exemplo01.definirX(20);
    exemplo01.definirY(3);

}
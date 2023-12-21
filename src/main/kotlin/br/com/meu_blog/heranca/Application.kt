package br.com.meu_blog.heranca
import java.math.BigDecimal

class Application  {

    //companion object - isso é semelhante a membros estáticos php,
    //não é necessário criar um objeto para chamar uma funçao de uma classe
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            println("")
            println("Calculadora:")

            val calculadora = Calculadora();
            calculadora.somar(BigDecimal(8));
            calculadora.multiplicar(BigDecimal(2));

            println("")
            println("Calculadora Ciêntifica:")

            val calculadoraCienctifica = CalculadoraCienctifica();
            calculadoraCienctifica.somar(BigDecimal(9));
            calculadoraCienctifica.potencia(2)
        }
    }
}
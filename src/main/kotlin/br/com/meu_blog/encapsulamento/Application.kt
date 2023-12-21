package br.com.meu_blog.encapsulamento
import java.math.BigDecimal

class Application  {

    //companion object - isso é semelhante a membros estáticos php,
    //não é necessário criar um objeto para chamar uma funçao de uma classe
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

        val calculadora = Calculadora();

            calculadora.somar(BigDecimal("3.7"));
            calculadora.multiplicar(BigDecimal("3"));
        }
    }
}
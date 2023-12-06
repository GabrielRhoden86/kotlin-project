package br.com.meu_blog.encapsulamento
import java.math.BigDecimal

class Calculadora {
    /*
       private
       protected
       public
       internal
    */

    private var resultado: BigDecimal = BigDecimal.ZERO;
    fun soma(a: BigDecimal) {
        resultado += a;
        mostrarResultado();
    }

    private fun mostrarResultado() {
        println("Resultado: $resultado")
    }

}
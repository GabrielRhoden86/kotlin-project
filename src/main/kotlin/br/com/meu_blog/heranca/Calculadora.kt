package br.com.meu_blog.heranca
import java.math.BigDecimal
import java.math.RoundingMode

open class Calculadora {
    /*
       private
       protected
       public
       internal
    */

    protected var resultado: BigDecimal = BigDecimal.ZERO;
    fun somar(a: BigDecimal) {
        println("Número: $a");
        resultado += a;
    }

    fun subtrair(a: BigDecimal) {
        println("Subtraído por:$a");
        resultado -= a;
        mostrarResultado();
    }

    fun multiplicar(a: BigDecimal) {
        println("Multiplicado por:$a");
        resultado *= a;
        mostrarResultado();
    }

    fun dividir(a: BigDecimal) {
        println("Divido por:$a");
        resultado =  resultado.divide(a,2, RoundingMode.HALF_UP);
        mostrarResultado();
    }

    protected fun mostrarResultado() {
        println("Resultado: $resultado")
    }

}
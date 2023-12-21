package br.com.meu_blog.heranca
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class CalculadoraCienctifica:Calculadora(){
fun potencia(a: Int){
    //O metodos pow calcula a potência
    resultado = resultado.pow(a, MathContext(8, RoundingMode.HALF_UP))
    println("Potência de:$a");
    mostrarResultado();
 }

}
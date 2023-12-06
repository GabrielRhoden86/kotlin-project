package br.com.meu_blog.encapsulamento2
import java.time.LocalDate;
class Pessoa(
    val cpf: String,
    val nome: String,
    val dataNasc: LocalDate,
    val salario: Double
) {

    val idade = LocalDate.now().year - dataNasc.year
    fun falar(menssagem:String){

        println("$nome falou: $menssagem, eu tenho $idade anos de idade. Meu salário é de $salario");

    }
}

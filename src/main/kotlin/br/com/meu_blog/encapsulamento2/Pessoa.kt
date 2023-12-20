package br.com.meu_blog.encapsulamento2
import java.time.LocalDate;

class Pessoa(
    val cpf: String,
    val nome: String,
    val dataNasc: LocalDate,
    val salario: Int
) {

    val idade = LocalDate.now().year - dataNasc.year
    //Quando declaramos var tanto get quanto set são gerados por debaixo dos panos
    var email = ""
        set(value) {
            if (!Regex("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matches(value)) {
                throw Exception("Ops Email inválido.")
            }else{
                println("Email validado!")
            }
            field = value
        }

    fun falar(mensagem: String) {
        println("Funcionou!!!")
    }
}

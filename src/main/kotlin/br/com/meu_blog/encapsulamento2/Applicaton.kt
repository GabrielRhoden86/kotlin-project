package br.com.meu_blog.encapsulamento2
import java.time.LocalDate

class Applicaton {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val gabriel = Pessoa("06478079988", "Gabriel", LocalDate.of(1986, 9, 24), 3790);
                gabriel.email = "teste@gmail.com"
        }
    }
}
package br.com.meu_blog.classes.poo
import java.time.LocalDate
class MainAplication {
    
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            val gabriel = Pessoa("12345678", "Gabriel", LocalDate.of(1986,9,24),3790.00);
            gabriel.falar("Boa tarde");


        }
    }
}
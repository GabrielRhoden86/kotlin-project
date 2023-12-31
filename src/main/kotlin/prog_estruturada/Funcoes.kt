package prog_estruturada
import java.math.BigDecimal

fun main() {
    val precosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99")
    )

    val precosProdutos2 = arrayOf(
        BigDecimal("12.99"), BigDecimal("222.99"), BigDecimal("120.99"), BigDecimal("211.99"),
        BigDecimal("10.99"), BigDecimal("5.00")
    )

    val result = somaPrecos(precosProdutos)
    //val result = somaPrecos(precosProdutos2)

    println("Resultado: $result")
    println("Resultado: pos-break")
}

fun somaPrecos(produtos: Array<BigDecimal>): BigDecimal {
    var precoTotal = BigDecimal.ZERO
    for (preco in produtos) {
        precoTotal += preco
    }

    return precoTotal
}

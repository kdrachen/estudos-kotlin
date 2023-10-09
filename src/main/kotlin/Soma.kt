import java.util.Scanner

fun main() {
    val entrada = Scanner(System.`in`)

    print("Digite o primeiro valor: ")
    val num1 = entrada.nextInt()
    print("Digite o segundo valor: ")
    val num2 = entrada.nextInt()

    fun soma(): Int {
        return num1 + num2
    }

    fun mult(): Int {
        return num1 * num2
    }

    println("Soma: ${soma()}")
    println("Multiplicação: ${mult()}")
}
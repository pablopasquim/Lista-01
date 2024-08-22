//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var resultado = soma(5,7)
    println(resultado)
    var result = sub(10f,9f)
    println(result)

    println("Olá mundo")
}

fun soma(n1: Int, n2: Int): Int {

    return n1 + n2
}

fun sub(n1: Float, n2: Float): Float {

    return n1 - n2
}
fun main() {
    exercicio05()
}

fun exemploFor1(){
    for (i in 1..10){
        println("Valor atual do contador: $i")
    }
}

fun exemploFor2(){

    // downTo serve para contar números de trás para frente

    println()
    println("Contagem Regressiva: ")
    for(i in 10 downTo 1){
        println(i)
    }
    println("Lançar!")
}

fun exemploFor3(){

    // Step é utilizado para pular números EXEMPLO: Step 2 > Pula de 2 em 2 números 1 > 3 > 5 > 7

    println("Valores ímpares entre 1 e 15")

    for(i in 1 .. 15 step 2){
        println(i)
    }
}

fun max(){

    var a: Int = 10
    var b: Int = 9

    val max = if(a > b) a else b
    println("O maior valor é: $max")

    // Mesma coisa que:
    /*
        if(a > b){
        max = a
        } else{
        max = b
        }
     */
}

fun opcoes(){

    // When é igual a switch case das outras linguagens

    val x: Int = 1

    when(x){
        1 -> println("X é 1")
        2 -> println("X é 2")
        else -> println("X é 0")
    }
}

fun exemploWhen(){

    // Similar a if e else if

    val x: Int = 20

    when{
        x > 0 -> println("X é Positivo")
        x < 0 -> println("X é Negativo")
        else -> println("X é Zero")
    }

    // Similar a:

    /*

     if(x > 0){
        println("X é Positivo")
     } else if(x < 0){
        println("X é Negativo")
     } else{
        println("X é Zero")
     }

     */
}

fun exercicio01(){

    println("Exercicio 01 - Média das Notas\n")

    println("Informe a nota da primeira prova")
    var n1 = readln().toFloat()
    println("Informe a nota da segunda prova")
    var n2 = readln().toFloat()
    println("Informe a nota da terceira prova")
    var n3 = readln().toFloat()

    val media = (n1 + n2 + n3)/ 3

    if (media in 6.75..6.99) {
        var media = 7.0f
    }

    var mediaFormatada = String.format("%.2f", media)



    if(media >= 7){
        println("Aprovado com média: $mediaFormatada")
    } else if(media > 4){
        println("Em recuperação: $mediaFormatada")
    } else{
        println("Reprovado!")
    }
}

fun exercicio02(){

    // readln - Recebe um valor que o usuário ira colocar no console.

    println("Exercicio 02 - Par ou Ímpar")

    println("Informe um valor inteiro: ")
    val valor = readln().toInt()

    when{
        valor % 2 == 0 -> println("$valor é par!")
        valor % 2 != 0 -> println("$valor é ímpar!")
    }
}

fun exercicio03(){

    // downTo serve para contar números de trás para frente

    println()
    println("Contagem Regressiva: ")
    for(i in 10 downTo 1){
        println(i)
    }
    println("Lançar!")
}

fun exercicio04(){

    println("Exercicio 4 - Soma de números de 1 a 100")

    var num = 0

    for(loop in 1..100){
        num += loop
    }

    println("$num")
}

fun exercicio05(){

    println("Exercicio 5 - Tabuada")

    print("Digite o número da tabuada: ")
    val num = readln().toInt()

    for(i in 1..10){
        val calc = num * i
        println("$num x $i = $calc")
    }
}

fun exercicio06(){

    println("Exercicio 6 - Fatorial")

    var num = 5
    var fatorial = 1

    for(i in num downTo 1){
        fatorial *= i

    }
    println("$fatorial")
}

fun exercicio07(){

    println("Exercicio 7 - Contar vogais numa palavra")

    println("Digite uma palavra: ")
    var palavra = readln()

    var cons = 0 // 0 consoantes
    var abcd = 0 // 0 vogais atualmente

    for(letra in palavra){
        if(letra.lowercaseChar() in "aeiou"){
            abcd++
        } else{
            cons++
        }

    }

    println("A quantidade de vogais na palavra $palavra é: $abcd \n" +
            "A quantidade de consoantes na palavra $palavra é: $cons")
}

fun exercicio08(){

    println("Exercio 8 - Verficação de número primo")

    println("Informe um número inteiro: ")
    var num = readln().toInt()
    var primo = true

    for(i in 2..num/2){
        if(num % i == 0){
            primo = false
            break
        }
    }
    if(primo){
        println("O número $num é primo!")
    } else{
        println("O número $num não é primo!")
    }

}

fun exercicio09(){

    println("Exercicio 9 - Fibonacci")

    val n = readln().toInt()

    var a = 0
    var b = 1

    for(i in 1..n){

        println("Número $i da sequência de Fibonacci: $a")

        val prox = a + b
        a = b
        b = prox
    }
}

fun exercicio10(){

    println("Exercício 10 - Jogo de Adivinhação")

    val numeroSecreto = (1..100).random()
    var acertou = false

    do {
        println("Digite um número entre 1 e 100:")
        val num = readln().toInt()

        when {
            num < numeroSecreto -> println("O número é maior!")
            num > numeroSecreto -> println("O número é menor!")
            num == numeroSecreto -> {
                println("Parabéns! Você acertou o número.")
                acertou = true

            }
        }
    } while (!acertou)
}

fun exercicio11(){

    println("Exercício 11 - Número Perfeito")

    val num = readln().toInt()

    var somaDiv = 0

    for(i in 1..num -1){
        if(num % i == 0){
            somaDiv += i
        }
    }
    if (somaDiv == num){
        println("Numero perfeito: $num")
    } else{
        println("Não é numero perfeito: $num  $somaDiv")
    }
}

fun exercicio12(){

    println("Exercicio 12 - Conversor de Notas")

    val nota = readln().toInt()

    when{
        nota >= 9 -> println("A")
        nota >= 7 && nota < 9 -> println("B")
        nota >= 5 && nota < 7 -> println("C")
        nota >= 3 && nota < 5 -> println("D")
        nota >= 0 && nota < 3 -> println("E")
    }
}

fun exercicio13(){

    println("Exercicio 13 - Pedra, Papel e Tesoura")

    val jogador1 = readln().lowercase()
    val jogador2 = readln().lowercase()

    val resultado = when {
        jogador1 == jogador2 -> "Empate!"
        jogador1 == "pedra" && jogador2 == "tesoura" -> "Jogador 1 vence!"
        jogador1 == "papel" && jogador2 == "pedra" -> "Jogador 1 vence!"
        jogador1 == "tesoura" && jogador2 == "papel" -> "Jogador 1 vence!"
        jogador2 == "pedra" && jogador1 == "tesoura" -> "Jogador 2 vence!"
        jogador2 == "papel" && jogador1 == "pedra" -> "Jogador 2 vence!"
        jogador2 == "tesoura" && jogador1 == "papel" -> "Jogador 2 vence!"
        else -> "Opção inválida! Certifique-se de digitar Pedra, Papel ou Tesoura."
    }

    println(resultado)
}

fun exercicio14(){

    println("Exercicio 14 - Calculadora")

    print("Digite o primeiro número: ")
    val n1 : Float = readln().toFloat()
    print("Digite o segundo número: ")
    val n2 : Float = readln().toFloat()

    print("Digite qual a operação desejada --> ( + , - , * , / ): ")
    val op = readln().toString()

    var resultado = when(op){
        "+" -> n1 + n2
        "-" -> n1 - n2
        "*" -> n1 * n2
        "/" -> n1 / n2
        else -> {
            println("Operação inválida")
        }
    }
    println("$n1 $op $n2 = $resultado")
}

fun exercicio15(){

    println("Exercicio 15 - Contador de Caracteres")

    print("Digite seu texto aqui --> ")
    var text = readln()

    var contador = 0

    for (texto in text){
        if (texto.lowercaseChar() in ""){
            contador++
        }
    }
    println(contador)
}

fun exercicio16(){

    println("Exercicio 16 - Encontrar o maior e menor número")

    var num = Array(5) { 0f }
    var max = 0f
    var min = 0f

    for(i in num.indices){
        print("Digite o ${i+1}° número: ")
        num[i] = readln().toFloat()

        when{
            i == 0 -> {
                min = num[0]
                max = num[0]
            }
            num[i] > max -> max = num[i]
            num[i] < min -> min = num[i]
        }
    }
    println("Valor máximo: $max")
    println("Valor mínimo: $min")
}

fun exercicio17(){

    println("Exercicio 17 - Soma dos Dígitos")

    var num = readln().toInt()
    var soma = 0

    while(num > 0){
        var digito = num % 10
        soma += digito
        num /= 10
    }

    println("Somas dos digítos é: $soma")
}

fun exercicio18(){

    println("Exercicio 18 - Número Armstrong")

    var n = readln().toInt()
    var soma = 0

    while (n > 0){
        for (i in 1..n){
            soma += i * i
            if (soma == n){
                println("Número de Armstrong")
            } else{
                println("Não")
            }
        }
    }
}

fun exercicio19(){

    println("Exercicio 19 - Sequência de Collatz")

    var n = readln().toInt()
    println("Sequência iniciada em: $n")

    while (n != 1){
        println("$n")
        if(n % 2 == 0){
            n /= 2
        } else{
            n = 3 * n +1
        }
    }
    println(n)
}

fun exercicio20(){

    println("Exercicio 20 - Soma dos Quadrados")

    var n = readln().toInt()
    var soma = 0

    for(i in 1..n){
        soma += i * i
    }
    println("A soma dos quadrados dos números de 1 a $n é: $soma")
}
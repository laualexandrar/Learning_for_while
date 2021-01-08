package newPractice

fun main() {
    val a = 3
    val b = 9

    println(a.plus(b))

    val c = 1..5

    for(number in c){
        println(number)
    }

    val numerito = 3

    when(numerito){
        in 1..5 -> println("Numerito esta entre 1 y 5")
        in 6..10 -> println("Numerito esta entre 6 y 10")
        else -> println("Numerito se encuentra despues de 10")
    }

    var i = 3


    while (i <= 10){
        println("numerito $i es menor que 10")
        i++
    }

    var ii = 3

    do {
        println("numerito: $ii ")
        ii++
    } while (ii<=7)
}
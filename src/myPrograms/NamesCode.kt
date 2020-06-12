package myPrograms

fun main() {

    val nombre: String = "Laura"
    nombre.toCharArray()

    for (letra in nombre) println(letra)

    val namesArray = arrayOf("Laura", "Camilo", "Pepa", "lola", "Lolo")

    for ((index, palabra) in namesArray.withIndex()) {
        if (index % 2 == 0) {
            println(" Index $index has palabra ${palabra.reversed()}")
        } else
            println(" Index $index has palabra $palabra")

    }

}









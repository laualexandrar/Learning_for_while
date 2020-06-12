package myPrograms

import kotlin.text.StringBuilder

fun main() {

    val builder = StringBuilder()
    val namesUL = arrayOf("Pepito", "Lola", "Ramona", "Maria", "Joel")

    for (element in namesUL) {
        // println(element)

        for ((index, letra) in element.withIndex()) {

            // println("la $letra esta en el index $index ")

            if (index % 2 == 0) {
                print(letra.toUpperCase())
            } else
                print(letra.toLowerCase())
        }
        println("\n")
    }
}



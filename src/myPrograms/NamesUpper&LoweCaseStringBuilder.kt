package myPrograms

fun main() {

    val codeNames = arrayOf("patricio", "Mickey", "Pluto", "Milo", "Daisy")

    for (elemento in codeNames) {
        val builder = StringBuilder()
        for ((index, letra) in elemento.withIndex()) {
            if (index % 2 == 0) {
                builder.append(letra.toUpperCase())
            } else {
                builder.append(letra.toLowerCase())
            }
        }
        print("$builder")
        println("\n")
    }
}
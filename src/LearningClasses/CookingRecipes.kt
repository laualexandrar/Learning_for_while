package LearningClasses

class CookingRecipes {

}

fun main() {
    var numOption:String?
    println(":: Welcome to recipe maker ::")

    do{

        val options = """
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir """.trimIndent()

        println(options)

    numOption = readLine()

    when(numOption){

        "1" -> println("You selected 1")
        "2" -> println("You selected 2")
        "3" -> println("Exit")
        else -> println("select a number between 1 to 3")

    }} while (numOption!="3")


}
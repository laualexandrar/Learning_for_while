package test


fun main() {
    val myDog = Dog()

    println(myDog.weight(200))
    myDog.bark(36)
}

class Dog {

    fun bark(age: Int): Unit {
        val edad = if (age > 5) "wooof" else "guau"
        print(edad)
    }

    fun weight(peso: Int): String = if (peso > 100) "Pesado" else "Desnutrido"
}


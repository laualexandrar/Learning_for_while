package test

fun main() {

    val miCasa1 = Casa()
    println(miCasa1.toString())
    miCasa1.addGuest("Lola")
    println(miCasa1.toString())
    miCasa1.addGuest("Minnie")
    println(miCasa1.toString())
}

class Casa {

    val owner = "Laura Roa"
    val rooms = 3
    val guests = arrayListOf("mickey", "Pepa", "patricio")

    // Este metodo retorna algo
    override fun toString(): String {
        return "This Casa has $rooms rooms and the owner is $owner, and it has ${guests.size} guests: $guests"
    }

    // Este metodo no retorna nada
    fun addGuest(newGuest: String) {
        guests.add(newGuest)
    }
}
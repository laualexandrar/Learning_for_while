package LearningClasses


class Dog(var name: String, var weight: Int, val breed: String) {

}

fun main() {
    val myDog = Dog("Copito", 70, "Pug")
    println("my dogs name is ${myDog.name}, it's weight is ${myDog.weight}, and is a ${myDog.breed}")

    val dogs = arrayOf(Dog("Nala", 70, "samoyedo"), Dog("Pelucas", 89, "Pug"))
    dogs[0].weight = 55
    dogs[1].name = "Dante"


    println("I had a dog called ${dogs[0].name}, she used to weight ${dogs[0].weight} when she was 6 years old, and she was a ${dogs[0].breed}. Then I had a dog called ${dogs[1].name}, he used to weight ${dogs[1].weight} and he was a ${dogs[1].breed}")

}
fun bark(){

}

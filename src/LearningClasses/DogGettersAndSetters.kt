package LearningClasses

class DogGettersAndSetters(val name: String, weight_paranm: Int, breed_param: String) {
    init {
        println("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    var weight = weight_paranm
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }

}

fun main() {
    val myDog = DogGettersAndSetters("Firulais", 34, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", " Frisbee")

    for (item in myDog.activities) {
        println("my Dog enjoys $item")
    }

    val dogs = arrayOf(DogGettersAndSetters("Kelpie", 20, "westie"), DogGettersAndSetters("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")

}
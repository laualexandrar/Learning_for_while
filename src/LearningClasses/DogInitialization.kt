package LearningClasses

class DogInitialization(val name: String, var weight: Int, breed_param: String) {
    init {
        println("Dog $name has been created")
    }

    var activities = arrayOf("Walk")
    val breed = breed_param.toUpperCase()
    var temperament: String =
        "mad " // If I want to initialize the variable later I can lateinit var temperament: String

    init {
        println("The breed is $breed")
    }

    override fun toString(): String {
        return "When he goes for a ${activities[0]} , he is always $temperament "
    }

}

fun main() {

    val myDog = DogInitialization("Fido", 67, "Samoyedo")
    println(myDog.toString())


}
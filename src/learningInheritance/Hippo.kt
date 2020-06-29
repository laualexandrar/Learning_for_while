package learningInheritance

class Hippo : Animal(){

    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    init {
        hunger = 89
    }

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }

}
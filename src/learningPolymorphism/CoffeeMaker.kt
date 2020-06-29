package learningPolymorphism

class CoffeeMaker : Appliance (){
    override val color = " "
    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming Power")
    }

    fun fillWithWater(){
        println("Fill with water")
    }

    fun makeCoffee(){
        println("Make the coffee")
    }

}
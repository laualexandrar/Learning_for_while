package test

fun main() {


    print(lola("Laura", 16))

    val variable: Unit = iDoNotReturnAnything()
    val returnedThing = iReturnSomething()

    println()
    println(basicSum(1, 1))
    println(1 + 1);
}

fun lola(name: String, age: Int): String = if (age < 21) "$name, you are underage" else "$name, you are an adult"

// Function (Basically a method that returns something)
fun iReturnSomething(): String {
    return "The returned value"
}

fun basicSum(x: Int, y: Int): Int {
    return x + y
}

// This is a method that does not return anything
fun iDoNotReturnAnything(): Unit {

}
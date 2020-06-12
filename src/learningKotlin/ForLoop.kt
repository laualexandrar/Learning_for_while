package learningKotlin

fun main() {

    println("Looping through a range of numbers: ")

    for (x in 1..10) print(" $x") // for (x in 1 until 100) println(x) prints number 1 to 99

    print("\n")

    println("Use downTo to reverse the range: ")

    for (y in 10 downTo 0) print(" $y")

    print("\n")

    println("Use step to skip numbers in the range: ")
    for (z in 1..10 step 2) print(" $z")

    print("\n")


    println("Use this to print the item: ")
    val optionsParam = arrayOf(1, 2, 3, 4, 5)

    for (item in optionsParam) {
        println("$item is an item in the array")
    }

    print("\n")

    println("Use this to print the index: ")
    for (index in optionsParam.indices) {
        println("Index $index has item ${optionsParam[index]}")
    }

    print("\n")

    for ((index, item) in optionsParam.withIndex()) {
        println("Index $index has item $item")
    }

}


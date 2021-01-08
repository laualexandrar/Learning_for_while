package descendingOrder

fun main() {
    val myFutureDescendingArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var i = 9

    while (i >= 0){
        println("${myFutureDescendingArray[i]}")
        i--
    }

//    println("This is the easy way to sort an Array of Numbers: ${myFutureDescendingArray.sortedArray()}") I cannot have the array with this just the reference
}
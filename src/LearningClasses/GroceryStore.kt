package LearningClasses

import java.util.*

class GroceryStore( var employeeName: String, var employeeId : Int, var numProdSoldByEmployee: Int,var productId: Int, var productCategory: String,  var nameProduct: String ){

}

fun main() {

   val myGroceryStore = GroceryStore("Patricia", 1001, 20,
       715, "Deli", "Yogurt")
    println("${myGroceryStore.employeeName} with the ID ${myGroceryStore.employeeId} sold ${myGroceryStore.numProdSoldByEmployee} " +
            "${myGroceryStore.nameProduct} belonging to the ${myGroceryStore.productCategory} category with the ID ${myGroceryStore.productId}")

    val stores = arrayOf(GroceryStore("Claudia", 1032, 2,
        890, "Deli", "Meat"), GroceryStore("Patricia", 1001, 20,
        715, "Deli", "Yogurt"), GroceryStore("Carlos", 12354, 89,
        902, "pastry", "cake"))

    println("I have three employees ${stores[0].employeeName}, ${stores[1].employeeName} and ${stores[2].employeeName}. " +
            "with the ID ${stores[0].employeeId}, ${stores[1].employeeId} and ${stores[2].employeeId} respectively. They have been selling different " +
            "kinds of products like ${stores[0].nameProduct}, ${stores[1].nameProduct} and ${stores[2].nameProduct}")
}
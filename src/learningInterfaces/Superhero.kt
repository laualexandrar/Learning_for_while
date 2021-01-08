package learningInterfaces

class Superhero : Flyable {
    override val x = "Superhero"
}

fun main() {
    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
    while (x in 0..2){
        when(f[x]){
            is Bird -> {
                x++
                f[x].fly()
            }
            is Plane, is Superhero -> f[x].fly()
        }
        x++
    }
}
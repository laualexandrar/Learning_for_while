package learningInheritance

class Vet {

    fun giveShot (animal: Animal){
        //Code
        animal.makeNoise()
    }
}

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }
    
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}
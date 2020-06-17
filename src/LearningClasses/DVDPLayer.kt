package LearningClasses

class DVDPLayer(var hasRecorder: Boolean) {

    fun recordDVD() {
        if (hasRecorder) {
            println("DVD recording")
        }
    }

    fun playDVD() {
        println("DVD playing")
    }

}

fun main() {
    val d = DVDPLayer(true)
    d.playDVD()
    d.recordDVD()
}
package LearningClasses

class Song ( val title:String, val artist: String) {
    fun play(){
        println("Playing the song $title by $artist")
    }
    fun stop(){
        println("Stopped playing $title")
    }

}

fun main() {
    val songOne = Song("The mesopotamias", "They might be giants")
    val songTwo = Song("Going underground", "The Jam")
    val songThree = Song("Make me Smile", "Steve Harley")
    songOne.play()
    songTwo.stop()
    songThree.play()
}
package LearningDataClasses

data class Movie(val title: String, val artist: String)
class Song(val title: String, val artist: String)

fun main() {
    var m1 = Movie("Black Panther", "2018")
    var m2 = Movie("Jurassic World", "2015")
    var m3 = Movie("Jurassic World", "2015")
    var s1 = Song("Love cats", "The Cure")
    var s2 = Song("Wild Horses", "The Rolling Stones")
    var s3 = Song("Love cats", "The Cure")


    println(m2 == m3)
    //is true because Movie is a dataclass and the data inside those variables is the same

    // println(s1 == s3) is false ... Because Song is no a dataclass

    //   3)
//    var m4 = m1.copy()
//    println(m1 == m4)   is true   I'm assigning the var to another var inside a dataclass

//    4)
//    var m5 = m1.copy()
//    println(m1 === m5)   is false   because the reference goes to a different object

//

//    5)
//    var m6 = m2
//    m2 = m3
//    println(m3 == m6)      this is true because I'm assigning the variable an another variable inside a dataclass


}
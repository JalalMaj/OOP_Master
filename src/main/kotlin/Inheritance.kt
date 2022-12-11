open class Dog{
    var size = 0

    fun bark() = println("bark")
    fun play() = println("play")
}

// Create a class inherit from main class Dog

class Corgi:Dog(){

}

fun main(args: Array<String>) {
    var myDog = Corgi()
    println(myDog.size)
    myDog.bark()
    myDog.play()
}
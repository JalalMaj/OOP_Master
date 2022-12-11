/*
A class Laptop has characteristics like screenSize and speed, and a function run() that prints out a message which
includes its characteristics.
A class Apple is a Laptop, so it inherits the laptop characteristics.
However it has a smaller screen size.
Implement this in a program, call the method run in both Laptop and Apple, and observe the different values.

 */
fun main(args: Array<String>) {
    val myLaptop = Laptop()
    val myApple = Apple()
    myLaptop.run()
    myApple.screenSize = 14
    myApple.run()
}
open class Laptop{
    var screenSize =16
    var speed =1200
    fun run(){
        println("The laptop has screen size : $screenSize inch and with speed $speed")
    }
}

class Apple:Laptop() {
}


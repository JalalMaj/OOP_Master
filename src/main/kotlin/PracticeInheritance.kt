/*
An Airplane has speed and altitude. It also two methods, ascend which increases altitude, and descend, which decreases altitude.
Create two classes that inherit from Airplane, Boeing and Airbus. They have different speeds.
Create objects, call methods and print out messages for both child classes.
 */
fun main(args: Array<String>) {
    val boieng737 = Boeing()
    val a320 = Airbus()

    boieng737.speed = 700
    a320.speed = 800

    boieng737.name ="Boeing 737"
    a320.name ="Airbus A320"

    boieng737.ascend(1000)
    a320.descend(1000)
    boieng737.ascend(1000)
    a320.ascend(1000)
}
open class Airplane{
    var name = "Generic Airplane"
    var speed = 1000
    var altitude = 20000

    fun ascend(a:Int){
        altitude+=a
        println("Airplane $name has an altitude of $altitude")
    }

    fun descend(a:Int){
        altitude-=a
        println("Airplane $name has an altitude of $altitude")
    }
}

class Boeing:Airplane(){
}

class Airbus:Airplane(){
}


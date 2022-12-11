fun main(args: Array<String>) {
 val myCar = Car1()
    // will be doing the init block when initiat instance of class
}

class Car1{
    var model:String? ="no mode"
    var topSpeed = 100

    init {
        println("the car has model $model and with top speed $topSpeed")
    }
}
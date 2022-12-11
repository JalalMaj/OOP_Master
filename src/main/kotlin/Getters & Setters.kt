fun main(args: Array<String>) {
 val car = WeiredCar()
    car.speed = 100
    println("car.name ${car.name}") //return High Speed 100
    println("car.speed ${car.speed}") //return 50
}

class WeiredCar{
    var name=""
        var speed:Int
            get() =50
             set(value) {
                name = "high speed car $value"
             }
}
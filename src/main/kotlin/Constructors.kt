fun main(args: Array<String>) {
    val myCar = Car()
    val yourCar = Car("Nissan")
    val hisCar = Car("BMW",120)
}

//Constructor how to create the class with variables
//class Car(var model:String,var speed:Int){}

class Car{

    constructor(){
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel:String){
        model = newModel
        topSpeed = 150
    }

    constructor(newModel:String,newSpeed:Int){
        model = newModel
        topSpeed = newSpeed
    }

    private var model: String? = null
    private var topSpeed: Int
}
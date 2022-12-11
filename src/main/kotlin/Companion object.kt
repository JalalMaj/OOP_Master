fun main(args: Array<String>) {
    println(Car2.getDrivingInstructions()) // No need to create an object use the class direct for calling the function
}

class Car2{
    companion object{
        fun getDrivingInstructions():String{
            return "Drive Safe!"
        }
    }

}
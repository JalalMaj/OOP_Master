/*
A class Job has three variables, name, revenue and salary, and two methods,
work - which increases revenue by the amount in salary
study - which increases salary

Two classes, Engineer and Doctor inherit from the Job class, but have different values for salary.

Create objects and call the functions a few times, printing out messages to see the result of the functions.
 */
fun main(args: Array<String>) {
    val engineer = Engineer()
    val doctor = Doctor()
    engineer.name = "Engineer"
    doctor.name = "Doctor"

    engineer.salary = 15000
    doctor.salary = 17000

    engineer.work()
    engineer.study(200)
    engineer.work()

    doctor.study(500)
    doctor.study(500)
    doctor.study(500)
    doctor.work()
}
open class Job{
    var name = "Generic Name"
    var revenue = 0
    var salary = 10000

    fun work(){
        revenue+=salary
        println("$name revenue will be $revenue")
    }

    fun study(a:Int){
        salary+=a
        println("$name salary will be $salary")
    }
}

class Doctor:Job(){
}

class Engineer:Job(){
}
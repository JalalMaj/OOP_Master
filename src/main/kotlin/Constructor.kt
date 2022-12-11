/*
Constructor is a singelton - One Instance of A class
variables and methods accessed directly
No instance should be created
 */
fun main(args: Array<String>) {
    if(Database.connected){ // Accessed to variable connected without Instance
        Database.disconnect() // Accessed to method connect() without Instance
    }else Database.connect()

    println("Database conneted value is : ${Database.connected}")
}
object Database{
    var connected = false
    fun connect(){
        connected =true
        println("It is connected")
    }

    fun disconnect(){
        connected =true
        println("It is disconnected")
    }
}
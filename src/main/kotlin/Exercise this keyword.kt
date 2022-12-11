/**
 * Exercise: The 'this' keyword
A table allows the user to adjust the height and size, through a function that also takes the parameters height and size.

Create the class, variable, function, instantiate it and call the function to adjust height and size.
 */

fun main(args: Array<String>) {
    var table = Table()
    table.adjustDimensions(200,250)
    table.printUpdate()
}

class Table{
    var height:Int =120
    var size:Int = 200

    fun adjustDimensions(height:Int,size:Int){
        this.height = height
        this.size = size
    }

    fun printUpdate(){
        println("The new height is $height and the new size is $size")
    }
}
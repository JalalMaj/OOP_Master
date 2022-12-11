/**
 *Create a calculator class. It should have
 * A variable that stores the total
 * A function that adds a number to the total
 * A function that subtracts a number from the total
 * A function that multiplies the total by an amount
 * A function that divides the total by an amount
 * A function that resets the total to 0
 * Create an object, test out the functions and print out some results.
 */

class Calculator{
    var total =0

    fun add(number:Int){
        total += number
        println(total.toDouble())}
    fun sub(number:Int){
        total -= number
        println(total)}
    fun mult(number:Int){
        total *= number
        println(total.toDouble())}
    fun divide(number:Int){
        total /= number
        println(total.toDouble())}
    fun reset() {
        total =0
        println(total)
    }
}

fun main(args: Array<String>) {
    var cal = Calculator()
    cal.add(5)
    cal.sub(2)
    cal.mult(5)
    cal.divide(5)
    cal.reset()
}
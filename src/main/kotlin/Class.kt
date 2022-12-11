fun main(args: Array<String>) {
val math =Math()
    println(math.add(3,7))
    println(math.subtract(3,7))
    println(math.multiply(3,7))
    println(math.divide(3,7))
}

class Math{
    fun add(x:Int ,y:Int) = x+y
    fun subtract(x:Int ,y:Int) = java.lang.Math.abs(x-y)
    fun multiply(x:Int ,y:Int) =x*y
    fun divide(x:Int ,y:Int)=x/y.toFloat()
}
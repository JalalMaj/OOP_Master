/**
 * A web browser will connect and display the home page when first started.

Create a class that achieves this functionality when instantiated.
 */

fun main(args: Array<String>) {
val myBrowser = WebBrowser()
}

class WebBrowser{
    init{
        println("web browser is connecting")
        println("www.google.com")
    }
}
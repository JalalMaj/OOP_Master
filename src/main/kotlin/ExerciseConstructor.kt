/*Create an online store user account class that has a userName and balance

Create 3 constructors for this class.

Inside the constructors, based on the user balance, print out whether they can afford the product tshirt,
 which costs 20, and if so, how many can they afford.
 */

fun main(args: Array<String>) {
   val user1 = userAccount()
    val user2 = userAccount("James")
    val user3 = userAccount("Jack",175)
    val user4 = userAccount("Mary",2635)
}

class userAccount {

    constructor() {
        userName = "Generic user"
        balance = 1
        canAfford()
    }

    constructor(newName: String) {
        userName = newName
        balance = 2
        canAfford()
    }

    constructor(newName: String, newBalance: Int) {
        userName = newName
        balance = newBalance
        canAfford()
    }

    var userName: String? = null
    var balance: Int = 0
    var tshirtPrice = 20

    fun canAfford() {
        var total = 0
        if (balance>tshirtPrice){
            total = balance/tshirtPrice
            println("$userName can buy $total t-shirts")
        }else println("$userName can't afford any t-shirt")

    }
}
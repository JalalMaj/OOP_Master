fun main(args: Array<String>) {
     val account = BankAccount()
    account.account = 300
    account.account = 400
    account.account = 100
}

class BankAccount{
    var creditRating = 500
    var account:Int = 0 //It should be initialized if you need to update the account value by using field
        get() = field
        set(value){
            if(value>account) creditRating++
            else creditRating--
        field = value // to update the account value
            println(field)
        println("new credit rating is $creditRating")
        }
}
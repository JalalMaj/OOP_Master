import java.util.Random

/**
 * A lock needs a key. The lock class will provide the ability to create key classes without the need for an object.
To create the lock, a key must be provided in the constructor. It then sets a secret code variable in both the lock and
the key, binding them together.
To open the lock, a key with the same secret code value must be provided.
Implement this functionality in a program.
 */
fun main(args: Array<String>) {
    val correctKey = Lock.createkey()
    println(correctKey)
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)

    val randomKey = Lock.createkey()
    println(randomKey)
    myLock.unlock(randomKey)
}

class Lock(key:Key){
    val secretCode: String
    init{
        secretCode = generateSecret()
        key.secretCode = secretCode
    }
    companion object{
        fun createkey() = Key()
    }

    fun generateSecret():String{
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key){
        if(key.secretCode == secretCode)
            println("lock is Open")
        else
            println("Key is not correct")
    }
}

class Key(){
var secretCode = ""
    set(value){
        if(field == "")
            field = value
    }
}
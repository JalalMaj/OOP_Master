fun main(args: Array<String>) {
    var note = PostItNote()
    println(note.message)
    note.updateMessage("Hello There!")
    println(note.message)
}

class PostItNote(){
    var message = "No message"

    //this used inside the function will refer to class variable
    fun updateMessage(message:String){
        this.message = message
    }
}
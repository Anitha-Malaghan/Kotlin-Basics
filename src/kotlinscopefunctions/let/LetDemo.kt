package kotlinscopefunctions.let
//Context object:
//Return value:
fun main() {
    val name: String? = "John"

    name?.let {
        println("The length of the name is ${it.length}")
    }

    val length = name?.let {
        it.length
    }
    println("Name length: $length")
}

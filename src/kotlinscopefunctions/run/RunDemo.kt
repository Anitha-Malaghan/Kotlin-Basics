package kotlinscopefunctions.run
//Context object:
//Return value:
fun main() {
    val result = "Hello".run {
        println("The receiver string is $this")
        length // Return the length of the string
    }
    println("Result: $result")
}
package kotlinclassfunctions.functiontypes

// Class with a member function
class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}

fun main() {
    val greeter = Greeter() // Creating an instance of the class
    greeter.greet("Bob") // Calling the member function
}

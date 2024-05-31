package kotlinclassfunctions.functiontypes

// Function with a local function
fun greeting(name: String) {
    fun formatGreeting(name: String): String {
        return "Hello, $name!"
    }

    println(formatGreeting(name)) // Calling the local function
}

fun main() {
    greeting("Charlie") // Calling the outer function
}

package kotlinfunction

fun main() {
    // Basic function
    fun add(a: Int, b: Int): Int = a + b
    println("Sum: ${add(2, 3)}")

    // Default and named arguments
    fun greet(name: String, greeting: String = "Hello") {
        println("$greeting, $name!")
    }
    greet(name = "Alice")
    greet(name = "Bob", greeting = "Hi")

    // Vararg parameter
    fun printAll(vararg messages: String) {
        for (message in messages) println(message)
    }
    printAll("Hello", "World", "Kotlin")

    // Higher-order function
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    println("Product: ${calculate(2, 3) { x, y -> x * y }}")

    // Lambda
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println("Lambda Sum: ${sumLambda(4, 5)}")

    // Extension function
    fun String.addExclamation(): String {
        return this + "!"
    }
    println("Hello".addExclamation())

    // Tail-recursive function
    tailrec fun factorial(n: Int, accumulator: Int = 1): Int {
        return if (n == 0) accumulator else factorial(n - 1, accumulator * n)
    }
    println("Factorial: ${factorial(5)}")
}


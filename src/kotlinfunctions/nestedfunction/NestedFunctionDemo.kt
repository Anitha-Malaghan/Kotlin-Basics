package kotlinfunctions.nestedfunction

fun outerFunction(a: Int, b: Int): Int {
    // A nested function
    fun innerFunction(x: Int, y: Int): Int {
        return x + y
    }

    // Call the nested function
    return innerFunction(a, b)
}

fun main() {
    val result = outerFunction(3, 7)
    println("Result: $result") // Output: Result: 10
}
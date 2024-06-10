package kotlinfunctions.inlinefunction

inline fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val sum = performOperation(5, 6) { x, y -> x + y }
    println("Result: $sum")
}
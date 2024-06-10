package kotlinfunctions.higherorderfunction

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val result = calculate(10, 20) { x, y -> x * y }
    println("Multiplication Result: $result")
}
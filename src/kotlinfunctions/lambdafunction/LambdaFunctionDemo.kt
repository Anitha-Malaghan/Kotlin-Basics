package kotlinfunctions.lambdafunction

fun main() {
    val square: (Int) -> Int = { x -> x * x }
    val result = square(7)
    println("Square: $result")
}
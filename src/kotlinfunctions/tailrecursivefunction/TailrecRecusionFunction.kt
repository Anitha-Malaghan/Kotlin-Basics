package kotlinfunctions.tailrecursivefunction

tailrec fun factorial(n: Int, acc: Int = 1): Int {
    return if (n <= 1) acc else factorial(n - 1, n * acc)
}

fun main() {
    val result = factorial(5)
    println("Factorial: $result")
}
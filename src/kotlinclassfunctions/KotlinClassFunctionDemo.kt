package kotlinclassfunctions

fun factorial(number: Int): Long {
    var result: Long = 1
    for (i in 2..number) {
        result *= i
    }
    return result
}
fun main() {
    val n = 5
    val fact = factorial(n)
    println("Factorial of $n is: $fact")
}
package kotlinwhen

fun main() {
    val obj: Any = "Hello, Kotlin!"
    val result = when {
        obj is String && obj.length > 5 -> "A long string"
        obj is Int && obj > 100 -> "A large integer"
        obj in 1..10 -> "A small number"
        else -> "Something else"
    }
    println(result) // Output: A long string
}   
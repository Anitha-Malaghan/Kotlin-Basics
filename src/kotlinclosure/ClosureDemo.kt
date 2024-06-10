package kotlinclosure

fun main() {
    val base = 5 // Variable from the enclosing scope
    val adder: (Int) -> Int = { x -> base + x } // Closure with lambda
    println(adder(3)) // Output: 8
    println(adder(7)) // Output: 12
}


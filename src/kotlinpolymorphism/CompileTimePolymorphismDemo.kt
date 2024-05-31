package kotlinpolymorphism

class MathOperations {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

fun main() {
    val mathOps = MathOperations()
    println(mathOps.add(2, 3))           // Output: 5
    println(mathOps.add(2.5, 3.5))       // Output: 6.0
    println(mathOps.add(1, 2, 3))        // Output: 6
}

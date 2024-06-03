package kotlinenums.enumwithabstractclass.example1

enum class Operation {
    ADD {
        override fun apply(x: Double, y: Double): Double = x + y
    },
    SUBTRACT {
        override fun apply(x: Double, y: Double): Double = x - y
    },
    MULTIPLY {
        override fun apply(x: Double, y: Double): Double = x * y
    },
    DIVIDE {
        override fun apply(x: Double, y: Double): Double = x / y
    };

    abstract fun apply(x: Double, y: Double): Double
}


fun main() {
    val x = 10.0
    val y = 5.0

    val addition = Operation.ADD.apply(x, y)
    val subtraction = Operation.SUBTRACT.apply(x, y)
    val multiplication = Operation.MULTIPLY.apply(x, y)
    val division = Operation.DIVIDE.apply(x, y)

    println("Addition: $addition")
    println("Subtraction: $subtraction")
    println("Multiplication: $multiplication")
    println("Division: $division")
}
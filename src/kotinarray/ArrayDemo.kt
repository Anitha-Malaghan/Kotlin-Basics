package kotinarray

fun main() {
    // Creating arrays
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val strings = arrayOf("one", "two", "three")

    // Accessing elements
    println("First element of numbers array: ${numbers[0]}")
    println("Second element of strings array: ${strings[1]}")

    // Modifying elements
    numbers[0] = 10
    println("Modified first element of numbers array: ${numbers[0]}")

    // Array length
    println("Length of numbers array: ${numbers.size}")

    // Iterating over elements
    println("Elements of numbers array:")
    for (number in numbers) {
        println(number)
    }

    // Using forEach function
    println("Elements of strings array:")
    strings.forEach { println(it) }

    // Using specific array classes
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    println("Elements of intArray:")
    intArray.forEach { println(it) }

    println("Elements of doubleArray:")
    doubleArray.forEach { println(it) }

    // Using Array constructor
    val array = Array(5) { i -> i * 2 }
    println("Elements of array created using constructor:")
    array.forEach { println(it) }
}
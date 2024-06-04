package kotlincollections.map

fun main() {
    // Create an immutable map
    val immutableMap = mapOf(
        1 to "apple",
        2 to "banana",
        3 to "orange"
    )

    // Print the elements of the map
    println("Original Map:")
    immutableMap.forEach { (key, value) -> println("Key: $key, Value: $value") }

    /*

    // Error:Kotlin: No set method providing array access.

    // Attempt to modify the map (will not compile)
     immutableMap[4] = "grape"

    // Attempt to remove an element from the map (will not compile)
     immutableMap.remove(1)

     */
}

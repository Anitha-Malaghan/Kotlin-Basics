package kotlincollections.map

fun main() {
    // Create a mutable map

    val mutableMap = mutableMapOf<Int, String>()

    //val mutableMap = hashMapOf<Int, String>()
    //val mutableMap = HashMap<Int, String>()


    // Add elements to the map
    mutableMap[1] = "apple"
    mutableMap[2] = "banana"
    mutableMap[3] = "orange"

    // Print the elements of the map
    println("Original Map:")
    mutableMap.forEach { (key, value) -> println("Key: $key, Value: $value") }

    // Modify an element in the map
    mutableMap[2] = "grape"

    // Add a new element to the map
    mutableMap[4] = "kiwi"

    // Remove an element from the map
    mutableMap.remove(1)

    // Print the modified map
    println("\nModified Map:")
    mutableMap.forEach { (key, value) -> println("Key: $key, Value: $value") }
}

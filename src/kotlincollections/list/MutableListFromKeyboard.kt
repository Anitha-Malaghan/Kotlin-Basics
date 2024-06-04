package kotlincollections.list

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter array size:")
    val length: Int =scanner.nextInt()

    // Create a mutable list of strings
    val mutableList = mutableListOf<String>()
    println("Enter fruits:")
    for(index in 0..length-1){

        mutableList.add(scanner.next())
    }

    // Print the elements of the list
    println("Original List:")
    mutableList.forEach { println(it) }

    // Modify an element in the list
    mutableList[1] = "grape"

    // Add an element at a specific index
    mutableList.add(2, "kiwi")

    // Remove an element from the list
    mutableList.remove("apple")

    // Print the modified list
    println("\nModified List:")
    mutableList.forEach { println(it) }
}
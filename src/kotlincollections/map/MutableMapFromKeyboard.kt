package kotlincollections.map

fun main() {
    val mutableMap = mutableMapOf<String, String>()

    println("Enter key-value pairs (key=value), or type 'exit' to finish:")
    var input: String?
    do {
        print("Input: ")
        input = readLine()?.trim()
        if (input != null && input != "exit") {
            val pair = input.split("=")
            if (pair.size == 2) {
                mutableMap[pair[0].trim()] = pair[1].trim()
                println("Added: ${pair[0]}=${pair[1]}")
            } else {
                println("Invalid input. Please enter key-value pairs in the format 'key=value'.")
            }
        }
    } while (input != null && input != "exit")

    println("\nResulting Map:")
    mutableMap.forEach { (key, value) -> println("Key: $key, Value: $value") }
}

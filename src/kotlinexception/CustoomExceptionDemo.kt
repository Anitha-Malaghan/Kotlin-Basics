package kotlinexception

class CustomException(message: String) : Exception(message)

fun main() {
    try {
        throw CustomException("Custom exception occurred")
    } catch (e: CustomException) {
        println("Caught custom exception: ${e.message}")
    }
}

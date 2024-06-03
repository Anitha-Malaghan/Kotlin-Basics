package kotlinsealedclass.sealedclasswithabstractclass

// Define the sealed class
sealed class Result {
    // Abstract subclass of Result
    abstract class Success : Result() {
        abstract val data: String
        abstract fun process(): String
    }

    // Concrete subclass of Success
    data class DataSuccess(override val data: String) : Success() {
        override fun process(): String {
            return "Processing success with data: $data"
        }
    }

    // Concrete subclass of Result
    data class Error(val message: String) : Result()
}

// Function to handle different types of Result
fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println(result.process())
        is Result.Error -> println("Error: ${result.message}")
    }
}

// Main function to test the setup
fun main() {
    val successResult = Result.DataSuccess("Data fetched successfully")
    val errorResult = Result.Error("Failed to fetch data")

    handleResult(successResult)
    handleResult(errorResult)
}

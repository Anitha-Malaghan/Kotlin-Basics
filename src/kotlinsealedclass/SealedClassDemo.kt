package kotlinsealedclass

sealed class Result
data class Success(val data: String) : Result()
data class Error(val message: String) : Result()
//interface Idle

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.data}")
        is Error -> println("Error: ${result.message}")
        //is Idle -> println("I am idle")
    }
}

fun main() {
    val successResult = Success("Data fetched successfully")
    val errorResult = Error("Failed to fetch data")
    //val idleResult = Idle()

    handleResult(successResult)
    handleResult(errorResult)
}

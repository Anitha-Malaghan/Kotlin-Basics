package kotlinsealedclass.sealedclasswithinterface

sealed class Result

interface Processable {
    fun process(): String
}

data class Success(val data: String) : Result(), Processable {
    override fun process(): String {
        return "Processing success: $data"
    }
}

data class Error(val message: String) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Processable -> println(result.process())
        is Error -> println("Error: ${result.message}")
        // Add else branch to handle all cases
        else -> throw IllegalArgumentException("Unknown result type")
    }
}

fun main() {
    val successResult = Success("Data fetched successfully")
    val errorResult = Error("Failed to fetch data")

    handleResult(successResult)
    handleResult(errorResult)
}

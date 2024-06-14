package kotlincoroutines

import kotlinx.coroutines.*

fun main() {
    val scope = CoroutineScope(Dispatchers.Default)

    val job = scope.launch {
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
    }

    // Block the main thread to wait for the coroutine to finish
    runBlocking {
        job.join()
    }
}

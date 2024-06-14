package kotlincoroutines

import kotlinx.coroutines.*

fun main() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val deferredJob: Deferred<Int> = async {   // Creates an async coroutine
        println("Fake work starts: ${Thread.currentThread().name}")     // Thread: main
        delay(1000)   // Coroutine is suspended but Thread: main is free (not blocked)
        println("Fake work finished: ${Thread.currentThread().name}") // Thread: main
        15  // This is the result of the async coroutine
    }

    val num: Int = deferredJob.await()  // main thread: wait for coroutine to finish and return data

    println("Result: $num") // main thread
    println("Main program ends: ${Thread.currentThread().name}")    // main thread
}

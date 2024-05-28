package kotlinifelse

fun main(){
    val time = 20
    val greeting1 = if (time < 18) { "Good day." } else { "Good evening." }
    println(greeting1)

    //Or

    val greeting2 = if (time < 18) "Good day." else "Good evening."
    println(greeting2)
}
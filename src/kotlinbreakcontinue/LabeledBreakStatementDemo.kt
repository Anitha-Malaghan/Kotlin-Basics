package kotlinbreakcontinue

fun main() {
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) {
                break@loop
            }
            println("i = $i, j = $j")
        }
    }
    println("Outer loop terminated.")
}
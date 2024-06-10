package kotlincontrolflowstatements.kotlinbreakcontinue

fun main() {
    outer@ for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) {
                continue@outer
            }
            println("i = $i, j = $j")
        }
    }
}
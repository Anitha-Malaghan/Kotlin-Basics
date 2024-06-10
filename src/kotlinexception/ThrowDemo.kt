package kotlinexception

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw IllegalArgumentException("Division by zero")
    }
    return a / b
}
fun main(){
    println(divide(10,5))

    /*

    //Exception in thread "main" java.lang.IllegalArgumentException: Division by zero
    println(divide(10,0))

    */
}

package kotlinfunctions.extensionfunction

//

fun String.addExclamation(): String {
    return this + "!"
}

fun exclamationFeature(name: String): String{
    return name + "!"
}
fun String.toUpper(): String{
    // return this.toUpperCase() :toUpperCase(): String' is deprecated. Use uppercase() instead.
    return this.uppercase()
}

fun main (){
val excited = "Hello".addExclamation()  // "Hello!"
println("$excited");

val message = exclamationFeature("Anitha")
    println("$message")

    val upperCase = " the extension function is specifically tied to the String class and is called directly on instances of String,".toUpper() // Attempt to use the toUpper function
    println(upperCase)

}
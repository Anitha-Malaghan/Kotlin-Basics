package typeconversion

fun main(){
    val x: Int = 5
    val y: Long = x.toLong()

    // to check the type of variable
    println(y:: class.java);

}

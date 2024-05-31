package kotlinscopefunctions.with
//Context object:
//Return value:
fun main() {
    val person = Person("John", 30)

    val result = with(person) {
        println("Name: $name")
        println("Age: $age")
        "Result: $name is $age years old" // Return a result
    }
    println(result)
}



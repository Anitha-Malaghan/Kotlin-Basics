package kotlinscopefunctions.apply
//Context object:
//Return value:
fun main() {
    val person = Person().apply {
        name = "John"
        age = 30
    }

    println(person)
}


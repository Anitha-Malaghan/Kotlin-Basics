package kotlinscopefunctions.also
//Context object:
//Return value:
fun main() {
    val person = Person("John", 30).also {
        println("Creating a person with name ${it.name} and age ${it.age}")
    }

    println(person)
}


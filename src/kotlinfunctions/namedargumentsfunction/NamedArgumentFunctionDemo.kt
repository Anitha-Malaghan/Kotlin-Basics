package kotlinfunctions.namedargumentsfunction

fun displayInfo(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

fun main() {
    displayInfo(age = 25, name = "Bob")
}
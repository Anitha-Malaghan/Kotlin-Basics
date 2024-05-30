package kotlinconstructors.primaryconstructor

class Person(val name: String, var age: Int) {
    // init block for initialization logic and it's not mandatory
    init {
        println("Person initialized with name = $name and age = $age")
    }
}

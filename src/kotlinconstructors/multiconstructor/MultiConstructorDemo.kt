package kotlinconstructors.multiconstructor

fun main() {
    val car1 = Car("Toyota", "Corolla")
    println("Make: ${car1.make}, Model: ${car1.model}, Year: ${car1.year}")

    val car2 = Car("Honda", "Civic", 2018)
    println("Make: ${car2.make}, Model: ${car2.model}, Year: ${car2.year}")
}

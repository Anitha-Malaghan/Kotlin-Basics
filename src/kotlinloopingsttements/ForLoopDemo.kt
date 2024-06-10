package kotlinloopingsttements

fun main() {

    //1. Iterating Over a Range

    for (i in 1..10) {
        println(i)
    }


    //2. Iterating Over a Range with a Step

    for (i in 1..10 step 2) {
        println(i)
    }


    //3. Iterating Over a Range in Reverse Order

    for (i in 5 downTo 1) {
        println(i)
    }

    //4. Iterating Over a Range in Reverse Order with a Step

    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    //5. Iterating Over an Array

    val carArray = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (car in carArray) {
        println(car)
    }

    //6. Iterating Over a list

    val carList = listOf("Volvo", "BMW", "Ford", "Mazda")
    for (car in carList) {
        println(car)
    }

    //7. Iterating Over an Array with Indices

    val cars1= arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (index in cars1.indices) {
        println("Car at index $index is ${cars1[index]}")
    }

    //8. Iterating Over a List with Indices

    val cars2 = listOf("Volvo", "BMW", "Ford", "Mazda")
    for ((index, car) in cars2.withIndex()) {
        println("Car at index $index is $car")
    }

    //9. Iterating over a map

    val map = mapOf("one" to 1, "two" to 2, "three" to 3)
    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }

}
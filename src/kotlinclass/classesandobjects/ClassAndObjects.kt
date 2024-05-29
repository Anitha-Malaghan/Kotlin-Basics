package kotlinclass.classesandobjects

class Car {

    var brand = ""
    var model = ""
    var year = 0

}
fun main(){
    val car= Car()
    car.brand = "BMW"
    car.model = "X5"
    car.year = 1995
    //car.year = 1996
    println("Car1 with brand ${car.brand} and model ${car.model} was born on ${car.year}")

    val car1= Car()
    car1.brand = "Ford"
    car1.model = "Mustang"
    car1.year = 1965
    //car.year = 1996
    println("Car2 with brand ${car1.brand} and model ${car1.model} was born on ${car1.year}")

}


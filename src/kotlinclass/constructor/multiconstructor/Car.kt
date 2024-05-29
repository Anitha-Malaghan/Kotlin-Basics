package kotlinclass.constructor.multiconstructor


// Primary and Secondary Constructor with Initialization Block

/*class Car(val make: String, val model: String) {
    var year: Int

    // Initialization block
    init {
        year = 2020
        println("Car initialized with make = $make, model = $model, and year = $year")
    }

    // Secondary constructor
    constructor(make: String, model: String, year: Int) : this(make, model) {
        this.year = year
        println("Car initialized with make = $make, model = $model, and year = $year")
    }
}

 */

//

class Car{
    var make: String
    var model: String
    var year: Int

    constructor(make:String, model: String, year:Int){
        this.make = make
        this.model = model
        this.year = year
    }

    constructor(make: String, model: String): this(make, model, 0){
        println("Car initialized with make = $make and default model = $model")
    }

}
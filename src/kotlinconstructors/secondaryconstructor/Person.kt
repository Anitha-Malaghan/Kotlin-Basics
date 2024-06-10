package kotlinconstructors.secondaryconstructor

//Delegation Approach Or Primary and Secondary Constructor with delegation
class Person {
   lateinit var name: String
    var age: Int

    // Primary constructor
    constructor(name: String, age: Int=18) {
        this.name = name
        this.age = age
    }

    // Secondary constructor
    constructor(name: String) : this(name, 20) {
        println("Person initialized with name = $name and default age = $age")
    }
}

// Separate Constructors Approach Or Two Secondary Constructors


/*
class Person {
   var name: String
   var age: Int

    constructor(name: String) {
       this.name = name
       this.age = 0
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
   }
}
*/

/*
Conclusion:
------------------
While theoretically, Class 1 might have a slight overhead due to the delegation and the print statement,
in practical terms, this difference is usually negligible. The choice between these two implementations
should focus on readability, maintainability, and adherence to coding standards rather than on minor
performance differences.







 */


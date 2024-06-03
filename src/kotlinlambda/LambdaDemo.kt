package kotlinlambda

fun main() {
    // variableName = Signature(Parameter and return type of the method body) = {parameter-> method body}

    // datatype variableName  = functionName:(datatype1, datatype2,..)-.returnType
                                            //                    = {parameterList -> operation to perform}
    // Lambda expression to add two numbers
    val add: (Int, Int) -> Int = { a, b -> a + b }

    // Using the lambda expression to add two numbers
    val result = add(5, 3)
    println("Result of addition: $result")

    // Lambda expression with single parameter
    val greet: (String) -> Unit = { name -> println("Hello, $name!") }

    // Using the lambda expression to greet someone
    greet("Alice")

    // Lambda expression with no parameters
    val getRandomNumber: () -> Int = { (1..10).random() }
    val getRandomNumber1: ()-> Int  = {(1..9).random()}

    // Using the lambda expression to get a random number
    val randomNumber = getRandomNumber()
    println("Random number: $randomNumber")
}

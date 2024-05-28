package kotlinvariables

fun main(args: Array<String>){
    var name1 = "John"
    val birthYear = 1975

    println(name1)          // Print the value of name
    println(birthYear)     // Print the value of birthYear

    var name2: String = "John" // String
    val birthyear: Int = 1975 // Int
    println(name2);

    //declare a variable without assigning the value, and assign the value later.
    var name3: String
    name3 = "John"
    println(name3)

    /*
    // Error: When using val, we  can't change the value whenever if we want.
    val name4 = "John"
    name4 = "Robert"
    println(name4)
    */

    //When using var, we can change the value whenever we want:
    var name5 = "John"
    name5 = "Robert"
    println(name5)

    //Display vriable
    val name = "John"
    println("Hello " + name)

    //You can also use the + character to add a variable to another variable

    val firstName = "John "
    val lastName = "Doe"
    val fullName = firstName + lastName
    println(fullName)







}
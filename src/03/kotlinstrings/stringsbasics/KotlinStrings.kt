package `03`.kotlinstrings.stringsbasics

fun main() {
    //Declaration and assignment for the variables.
    var greeting1 = "Hello";
    var greeting2: String = "Hello";

    //Declaring string with data type and assigning a value later
    var name1: String
    name1 = "John"
    println(name1)

    /*
    //This will generate an error as datatype is mandatory in declaration :
    var name2
    name2 = "John"
    println(name2)

    */

    //Access a String
    var txt1 = "Hello World"
    println(txt1[0]) // first element (H)
    println(txt1[2]) // third element (l)

    //String length
    var txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: "+txt2.length)

    //String Concatenation
    var firstName1 = "John"
    var lastName1 = "Doe"
    println(firstName1 + " " + lastName1)

    //String Templates/Interpolation
    var firstName2 = "John"
    var lastName2 = "Doe"
    println("My name is $firstName2 $lastName2")




}
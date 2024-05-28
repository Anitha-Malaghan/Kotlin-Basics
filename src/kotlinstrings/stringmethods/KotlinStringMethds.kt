package kotlinstrings.stringmethods

fun main(){

    //1. uppercase() and lowercase():
    var txt = "Hello World"
    println(txt.uppercase())   // Outputs "HELLO WORLD"
    println(txt.lowercase())   // Outputs "hello world"


    //2. Comparing two stings
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)


    //3. Finding a String in a String
    var message = "Please locate where 'locate' occurs!"
    println(message.indexOf("locate"))  // Outputs 7


    //4.Substring
    val str1 = "Hello, Kotlin!"
    println(str1.substring(7, 13)) // Output: Kotlin

    //5.(plus) Adding two strings
    var firstName = "John "
    var lastName = "Doe"
    println(firstName.plus(lastName))

    //6. contains
    val str2 = "Hello, Kotlin!"
    println(str2.contains("Kotlin")) // Output: true


    //7. startsWith
    val str3 = "Hello, Kotlin!"
    println(str3.startsWith("Hello")) // Output: true

    // 8. endsWith
    val str4 = "Hello, Kotlin!"
    println(str4.endsWith("Kotlin!")) // Output: true

    //9. indexOf
     val str5 = "Hello, Kotlin!"
    println(str5.indexOf("Kotlin")) // Output: 7

    //10. lastIndexOf
     val str6 = "Hello, Kotlin! Kotlin!"
    println(str6.lastIndexOf("Kotlin")) // Output: 14

    //11. replace
    val str7 = "Hello, Kotlin!"
    println(str7.replace("Kotlin", "World")) // Output: Hello, World!

    //12. trim
    val str8 = "   Hello, Kotlin!   "
    println(str8.trim()) // Output: Hello, Kotlin!

    //13. split
    val str9 = "Hello, Kotlin, World"
    val parts = str9.split(", ")
    println(parts) // Output: [Hello, Kotlin, World]

    //14. joinToString
    val list = listOf("Hello", "Kotlin", "World")
    val result = list.joinToString(", ")
    println(result) // Output: Hello, Kotlin, World

    //15. isEmpty
    val str10 = ""
    println(str10.isEmpty()) // Output: true

    //16. isNotEmpty
    val str11 = "Hello"
    println(str11.isNotEmpty()) // Output: true

    //17. isBlank
    val str12 = "   "
    println(str12.isBlank()) // Output: true

    //18. isNotBlank
    val str13 = "Hello"
    println(str13.isNotBlank()) // Output: true


    //19. toInt, toLong, toDouble, etc.

    val str14 = "123"
    println(str14.toInt()) // Output: 123

    //15. format
    val str15 = "Hello, %s!".format("Kotlin")
    println(str15) // Output: Hello, Kotlin!

    //16. substringAfter
    val str16 = "Hello, Kotlin!"
    println(str16.substringAfter("Hello, ")) // Output: Kotlin!

    //17. substringBefore
    val str17 = "Hello, Kotlin!"
    println(str17.substringBefore(", ")) // Output: Hello

    //18. repeat
    val str18 = "Hi"
    println(str18.repeat(3)) // Output: HiHiHi


}
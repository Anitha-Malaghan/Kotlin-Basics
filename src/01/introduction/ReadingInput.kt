package `01`.introduction

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    //String
    print("Enter your name: ")
    val name = sc.next()
    //Integer
    print("Enter your age: ")
    val age = sc.nextInt()

    //Boolean
    print("Enter marital status: ")
    val married = sc.nextBoolean()

    //Float
    print("Enter PSP: ")
    val psp = sc.nextFloat()


    println("Entered name: $name")
    println("Entered age: $age")
    println("Entered married: $married")
    println("Entered psp: $psp")
}

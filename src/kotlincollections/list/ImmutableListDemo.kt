package kotlincollections.list

import java.util.*

fun main(args: Array<String>){

    var myArray = listOf<String> ("Anu", "Akshu")
    for(name in myArray){
        println(name)
    }


  /* // Error: One of the following candidates is applicable because of receiver type mismatch:
    myArray[0]="Arun"
    for(name in myArray){
        println(name)
    }*/

}
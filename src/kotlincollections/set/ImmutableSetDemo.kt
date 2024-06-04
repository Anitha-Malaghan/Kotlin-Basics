package kotlincollections.set

fun main(args: Array<String>){

    var myArray = setOf<String> ("Anu", "Akshu")
    for(name in myArray){
        println(name)
    }

    /*

    Kotlin Error: Unresolved reference: add
    myArray.add("kk")

    */


    /*
     Error: One of the following candidates is applicable because of receiver type mismatch:
     myArray[0]="Arun"
     for(name in myArray){
         println(name)
     }

     */


}
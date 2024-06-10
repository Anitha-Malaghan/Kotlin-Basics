package kotlinfilerandmapfunctions

fun main(args: Array<String>){
    var myList = listOf(1,2,5,8,10,28,93)


    println("Original list ")
    for(ele in myList){
        println(ele);
    }

    var mySmallList = myList.filter { it<10 }

    println("List after filtration")
    for(ele in mySmallList){
        println(ele);
    }
}
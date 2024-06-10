package kotlinfilerandmapfunctions

fun main(args: Array<String>){
    var myList = listOf(1,2,3,4,5,6);

    println("Elements of the original list are:")
    for(ele in myList)
        println(ele)

    var mySquaredList = myList.map{it*it}
    println("Elements of the original list are:")
    for(ele in mySquaredList)
        println(ele)

}
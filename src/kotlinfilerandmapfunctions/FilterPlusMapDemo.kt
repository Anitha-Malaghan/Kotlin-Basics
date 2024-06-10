package kotlinfilerandmapfunctions

fun main(args: Array<String>){
    var myList = listOf(1,2,3,4,5,6,7)

    //Filtering the squared number
    var mySquaredSmallList = myList.map{it*it}.filter { it<10 }
    for(ele in mySquaredSmallList)
        println(ele)

    //Squaring the filtered number
    var mySmallSquaredList = myList.filter { it<10 }.map{it*it}
    for(ele in mySmallSquaredList)
        println(ele)
}
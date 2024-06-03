package kotlinenums.enumbasic
//Accessing Enum Constants
fun main(){
    val value:CreditCardType = CreditCardType.GOLD
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD.name)

    val myConstants:Array<CreditCardType> =CreditCardType.values()

    myConstants.forEach(::println)
    //myConstants.forEach(println(it))
}
package kotlinnullsafeoperators

fun main(args: Array<String>){
    val name:String? = "Anitha"

    //1.safe call (?.)
    println("the length of the name is with safe call: ${name?.length}")

    //2. safe call with let(?.let)
    name?.let{
        println("the length of the name is with safe call with let: ${name.length}")
    }

    //3. Elvis operator(?:)
    println("The length of the name with elvis operator: ${name?.length?:-1}")

    //4. not null assertion operator(!!)
    println("The length of the name with not null assertion operator ${name!!.length}")
}
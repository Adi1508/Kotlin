
//example to pass the list and get it in the form of JSON
fun main(args: Array<String>) {
    println(joinOptions(listOf("yes","no","may be")))
}

fun joinOptions(options: Collection<String>) = options.joinToString(prefix="[",postfix="]")
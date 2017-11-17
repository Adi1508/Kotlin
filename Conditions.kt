fun main(args: Array<String>) {
    println("Max of Two Numbers")
    println(maxOf(19, 35))
}

/*
fun maxOf(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}*/

fun maxOf(a: Int, b: Int) = if (a > b) a else b
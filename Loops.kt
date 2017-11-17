fun main(args: Array<String>) {

    println("For Loop")
    val items = listOf("apple", "banana", "orange")
    for (item in items) {
        println(item)
    }
    println("")
    println("While Loop")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    println("")
    println("When Expression")
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("")
    println("For loop using ranges")
    val x=1
    val y=10
    for(x in 1..y+1){
        print("$x ")
    }
}

fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greetings"
    is Long -> "Long"
    !is String -> "Not a String"
    else -> "Unknown"
}
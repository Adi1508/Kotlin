package Inheritence

//this is an overriding example

open class Person() {
    open fun displayAge(age: Int) {
        println("Age is $age")
    }
}

class Girl : Person() {
    override fun displayAge(age: Int) {
        println("my fake age is ${age - 5}")
    }
}

fun main(args: Array<String>) {
    val g = Girl()
    g.displayAge(31)
}



package Inheritence

open class Student(age: Int, name: String) {

    init {
        println("Student name is $name")
        println("Student age is $age")
    }
}

class Teacher(age: Int, name: String) : Student(age, name) {
    fun teach() {
        println("I am a great teacher")
    }
}

class Play(age: Int, name: String) : Student(age, name) {
    fun play() {
        println("play clash royale")
    }
}

fun main(args: Array<String>) {
    val t1=Teacher(25,"Aditya")
    t1.teach()
    println()
    val f1=Play(21,"Jack")
    f1.play()
}
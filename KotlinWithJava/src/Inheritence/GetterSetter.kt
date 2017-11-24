package Inheritence

open class Person1() {
    open var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

class Girls:Person1(){
    override var age:Int=0
    get()=field
    set(value){
        field=value-5
    }
}
fun main(args:Array<String>){
    val girl=Girls()
    var per=Person1()
    per.age=32
    println("${per.age}")
    girl.age=31
    println("fake age of a girl is ${girl.age}")
}
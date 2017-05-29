package com.goodtemp.learn

/**
 *
 * Created by guojing on 2017/5/27.
 */
open class Base(var name: String)

class Customer(name: String, var age: Int) : Base(name){

    constructor(name: String, age: Int , other:String) : this(name, age){
        this.other = other
    }

    init {
        println("init. name:$name, age:$age")
    }

    var other: String = ""

    fun print(){
        println("print. name:$name, age:$age, other:$other")
    }
}

data class User(var name:String, var age:Int) {
    constructor(name:String) :this(name, 10)
}


interface Base1 {
    fun print()
}

class BaseImpl(val x: Int) : Base1 {
    override fun print() { println(x) }
}

class Derived(b: Base1) : Base1 by b{
    fun print(b:Base1) {
        println()
        println("aaaa")
    }
}


fun main(args: Array<String>) {
    //属性
    var cu = Customer("aa", 10, "aaa")
    cu.age =11
    cu.other = "ccc"
    cu.print()

    //数据类
    val user = User("gj", 10)
    println(user.toString())

    //委托
    var bi = BaseImpl(10)
    Derived(bi).print()
    var d = Derived(bi)
    d.print()
    d.print(bi)
}

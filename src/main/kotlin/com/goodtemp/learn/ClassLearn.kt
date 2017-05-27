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

fun main(args: Array<String>) {
    var cu = Customer("aa", 10, "aaa")
    cu.age =11
    cu.other = "ccc"
    cu.print()
}

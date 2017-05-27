package com.goodetemp.learn

/**
 *
 * Created by guojing on 2017/5/26.
 */

data class Customer(var name: String, var email: String)

class Personel {
    var name: String = ""
    get() = field
    set(value) {field=value}
}

fun main(args: Array<String>) {
    var a: Customer? = Customer("aa", "bb")
    a?.name = "ddd"
    a?.let { println("not null: ${a.name}") } ?: println("bbbb")
}
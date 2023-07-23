package com.waudeshindumina.kotlin

///Arithmetic & Logic Operation
//(+,-,*,/,%)
fun main() {
    var result1 = 5 + 7
    println(result1) //12
    result1 /= 2
    println(result1)//6

    var result2 = 6-3
    println(result2)//3

    var a = 7
    var b = 2
    var myModular = a%b
    println(myModular)//1

    var number2 = a/b
    println(number2)//3

    // give to 3.5
    var c = 7.0
    var number3 = c/2
    println(number3)//3.5

    var d = (7).toDouble()
    var number4 = d/2
    println(number4)//3.5
}
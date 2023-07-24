package com.waudeshindumina.kotlin

fun main(){
    myFunction()
    myFunction()
    addFunction(10,52)
    var result = addFunction(50,96)
    println("main function result $result")
}
fun myFunction(){
    println("myfunction was called")
}
fun addFunction(a :Int , b: Int):Int{
    var result = a+b
    println("result is $result")
    return result
}
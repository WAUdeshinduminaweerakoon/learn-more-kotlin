package com.waudeshindumina.kotlin

fun main(){
//   var name = "udesh"
//    //name = null//error
//    var nullableName : String? = "Indumina"
//    nullableName = null //not error
//
//    var nameLen = name.length
//    //var nullableNameLen = nullableName.length // error
//    if(nullableName!=null){
//        var nullableNameLen = nullableName.length
//        println(nullableNameLen)
//    }else {
//        null
//        println("not a length")
//    }
//
//
//    /////////////////////////////////////////////////////////////
//     var nullableNameLen1 = nullableName?.length
//    println(nullableNameLen1)
//    println(nullableName)

    /////////////////////////////////////////////////////
     var nullableName2 :String? = "Udesh"

    var nam1 = nullableName2 ?: "Default"
    println(nam1) //udesh


    nullableName2 = null

    //Elves Operator
    var nam2 = nullableName2 ?: "Default"
    println(nam2)//Default



}
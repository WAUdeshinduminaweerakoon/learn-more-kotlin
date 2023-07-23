package com.waudeshindumina.kotlin

fun main(){
    //if Statement
// var a = 157//cm
//    var b = 170 //cm
//    if (a>b){
//        println(" a ,He is tall")
//    }else{
//        println(" a ,He is short")
//    }
//
    //when statement
//    var month = 19
//    when(month){
//        1 -> println("January")
//        2 -> println("February")
//        3 -> println("March")
//        4 -> println("April")
//        5 -> println("May")
//        6 -> println("June")
//        7 -> println("July")
//        8 -> println("August")
//        9 -> println("September")
//        10 -> println("October")
//        11 -> println("November")
//        12 -> println("December")
//        else -> println("Invalid Month")
//
//    }
//    var distance = 80 //km
//    when(distance){
//        in 6..14->{
//            println("veayangoda")
//            println("Gampaha")
//            println("Kelaniya")
//        }
//        in 21 .. 71->{
//            println("Anuradapuraya")
//            println("Polonnaruwa")
//        }
//        in 100 downTo  75 ->{
//            println("Kilinochchiya")
//            println("yapanaya")
//        }
    var mix : Any = 3.45

    when(mix){
        is Int -> println("$mix is a Int")
        is Double -> println("$mix is a Double")
        is String -> println("$mix is a String")
        is Float -> println("$mix is a Float")

        else -> println("$mix is a Something else")


    }




}
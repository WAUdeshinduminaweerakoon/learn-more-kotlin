package com.waudeshindumina.kotlin

fun main(){

    ////////////////while loop///////////////////
//    var number = 1
//    while (number<=10){
//        println(number)
//        number++
//    }
//    println("while loop is over")
//    var number2 = 0
//    while(number2<=100){
//        number2+=2
//        println(number2)//2->102
//    }
//    while(number2<100){
//        number2+=2
//        println(number2)//2->100
    //}
//    var number3 =2
//    while(number3<=100){
//        println(number3)//2->100
//        number3+=2
//    }

    //////////////// do while loop//////////////

//    var number4 = 1
//    do{
//        number4 += 1
//        println(number4)
//    }while(number4<=10)//2->11
//    do{
//        println(number4)
//        number4 += 1
//
//    }while(number4<=10)//1->10
    ////////////for loop/////////
    for ( number in 1..10 ){
        println(number)//1->10
    }
    for(number in 1..10 step 2){
        println(number)//1, 3, 5, 7, 9
    }
    for(number in 10 downTo 1){
        println(number)//10->1
    }
}

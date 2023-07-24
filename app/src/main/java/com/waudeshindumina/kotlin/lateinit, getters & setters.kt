package com.waudeshindumina.kotlin

fun main(){
/////////////////////////////////////////////Lateinit/////////////////
//    var car = Car()
//    car.name
//
//}
//class Car (){
//    lateinit var name : String
//
//
//    init {
//       name=  "Ferrari"
//        println(name)
//    }

    //////////////////////////////Getter///////////////////////////

    var car = Car()
    car.name
    println("BrandName is ${car.brandName}")//BrandName is bmw
    car.maxSpeed = 200
    println("Speed is ${car.maxSpeed}")




}
class Car (){
    lateinit var name : String
    var brandName = "BMW"
    get() {
        return field.lowercase()
    }
//    get() = field
//
//    set(value){
//      field = value
//    }
var maxSpeed =500

    set(value){
         field = if (value > 0) value else throw IllegalArgumentException("speed can't reduce under 0")
    }


    init {
        name=  "Ferrari"
    }

}
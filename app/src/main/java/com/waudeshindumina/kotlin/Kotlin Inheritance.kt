package com.waudeshindumina.kotlin

fun main(){
 var car1 = Car1("BMD","X2")
 var electricCar = ElectricCar("Tesla","S mode", 96.0)
 car1.driving(250.0)
 electricCar.driving(300.0)

}
 open class Vehicle {
     open var range = 0.0
  fun extendRange(extendedDisatace : Double){
   range += extendedDisatace
  }

}
//sealed class Vehicle {//////////////not used Inheritance
//    //properties
//    //methodes

//}
open class Car1(val name:String, val model:String) :Vehicle(){
 open fun driving(distance:Double){
  println("This car can be driven $distance")
 }

}
class ElectricCar(name: String, model: String ,batteryLife : Double) : Car1(name, model){

 override var range = batteryLife*7
 override fun driving(distance: Double){
  println("This car can be driven $range  using electricity")
 }
}
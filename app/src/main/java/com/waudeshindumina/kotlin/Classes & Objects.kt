package com.waudeshindumina.kotlin

fun main(){
    Person("Udesh","Indumina")
    Person1()
    var udesh = Person1(lastName = "Indumina")
    udesh.myFavouriteColor()



}

class Person(firstname:String,lastName:String) {
    init {
        println("My name is $firstname $lastName")
    }
}
class Person1(firstname:String="Werakonda",lastName:String="Arachchilage") {
    init {
        println("My name is $firstname $lastName")
    }

////////Member Variable or properties

    var age: Int? = null
    var favouriteColor = "red"

    fun myFavouriteColor() {
        println("My favourite Color is $favouriteColor")
    }

}


package com.csdev.week2

class Cat (
    var name: String = "",
    var height: Double = 0.0,
    var length: Double = 0.0,
    var weight: Double = 0.0
    ){
        fun playing() {
            println("$name is playing")
        }
        fun eat() {
            weight = weight + 1
        }

}

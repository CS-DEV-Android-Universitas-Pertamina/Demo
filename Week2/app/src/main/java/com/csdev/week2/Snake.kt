package com.csdev.week2

class Snake: Animal() {

    fun walk () {
        println("Snake can walk")
    }

    override fun eat(){
        println("Snake eat fish")
    }
}
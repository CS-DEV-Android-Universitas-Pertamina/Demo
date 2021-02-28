package com.csdev.week1

import android.util.Log

class Week1 {
    //Variables
    //Example
    companion object {
        const val MY_CODE_COUNTRY = "ID"
    }

    var myMoney: Int = 10000
    //Juga bisa di tulis dengan
    var myAge = 22

    //var dan val
    var myClass = 10
    val myFloor = 2

    fun example(){
        myClass = 9
        //myFloor = 1
        //error val tidak bisa diubah
    }
    //Data Types
    val number1: Int = 20
    val number2: Int = 20
    val result = number1 + number2
    // result = 40
    val string1: String = "20"
    val string2: String = "20"
    val result2 = string1 + string2
    // result = “2020”

    //Char
    val character: Char = 'a'
    val asciiValue = 97
    val charValue = asciiValue.toChar()
    //result charValue adalah a

    //String
    val text = "Kotlin"
    val length = text.length
    fun example2(){
        Log.v("result","Number of word \"" + text + "\" is " + length)
        Log.v("result","Number of word $text is ${text.length}")
        // result Number of word “Kotlin” is 6
    }

    //Array
    val intArray = arrayOf<Int>(1, 3, 5, 7)  // [1, 3, 5, 7]
    fun example3() {
        intArray[2] = 11                             // [1, 3, 11, 7]
        Log.v("result", "${intArray[2].toString()}")
        // result : 11
    }

    //Nullable Types
    val textString: String? = null
    // wrong val textString: String = null

    // Safe call operator (?.)
    val text1: String? = null
    val textLength1 = text1?.length
    //textLength = null (not error)

    // Elvis operator (?:)
    val text2: String? = null
    val textLength2= text2?.length ?: 0
    // textLength = 0


    //Basic Operators

    //Functions
    //Function With Return Unit Type
    fun main() {
        setUser("Alzahid", 17)
    }

    fun setUser(name: String, age: Int): Unit{
        Log.v("result","Your name is $name, and your age is $age years old")
    }
    //Function With Return Value
    fun main1() {
        val user = setUser1("Alzahid", 17)
        Log.v("result", user)
    }

    fun setUser1(name: String, age: Int): String {
        return "Your name is $name, and your age is $age years old"
    }
    //Single-expression Functions
    fun main2() {
        val user = setUser1("Alzahid", 17)
        Log.v("result", user)
    }
    fun setUser3(name: String, age: Int): String = "Your name is $name, and your age is $age years old"

    //Control Flow
    fun controlFlow(){
        val openHours = 7
        val now = 7
        if (now > 7) {
            Log.v("result","Office already open")
        } else if (now == openHours){
            Log.v("result","Wait a minute, office will be open")
        } else {
            Log.v("result","Office is closed")
        }
    // Output : "Wait a minute, office will be open"
    // because first condition false and second condition is true
    }
    //If Expression
    fun controlFlow2(){
        val openHours = 7
        val now = 7
        val office: String
        office = if (now > 7) {
            "Office already open"
        } else if (now == openHours){
            "Wait a minute"
        } else {
            "Office is closed"
        }
        Log.v("result",office)
    }
    fun main3() {
        val value = 7
        val stringOfValue = when (value) {
            6 -> "value is 6"
            7 -> "value is 7"
            8 -> "value is 8"
            else -> "value cannot be reached"
        }
        Log.v("result", stringOfValue)

        //Check type of data
        val anyType : Any = 100L
        when(anyType){
            is Long -> Log.v("result","the value has a Long type")
            is String -> Log.v("result","the value has a String type")
        }

        //Check more than one value
        val x = 11
        when (x) {
            10, 11 -> Log.v("result","the value between 10 and 11")
            11, 12 -> Log.v("result","the value between 11 and 12")
        }

        //Check in Range
        val value2 =  27
        val ranges = 10..50
        when(value2){
            in ranges -> Log.v("result","value is in the range")
            !in ranges -> Log.v("result","value is outside the range")
        }

        //Check arithmetic value
        val x1 = 10
        when (x1) {
            5 + 5 -> print("the value is 10")
            10 + 10 -> print("the value is 20")
        }

    }
    //Looping
    //Data Classes
    //Collections
}
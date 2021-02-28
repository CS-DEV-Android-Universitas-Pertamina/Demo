package com.csdev.week2

import android.util.Log

class Week2 {
    //Loop
    fun loop() {
        var counter = 1
        while (counter <= 5){
            Log.d("result : ","Hello World")
            counter++
        }
    }

    fun noLoop(){
        Log.d("result : ","Hello World")
        Log.d("result : ","Hello World")
        Log.d("result : ","Hello World")
        Log.d("result : ","Hello World")
        Log.d("result : ","Hello World")
    }

    //doWhile
    fun doWhile() {
        var counter = 1
        do {
            Log.d("result : ","Hello World")
            counter++
        } while (counter <= 5)
    }

    //infiniteLoop
    fun exampleInfinite1(){
        var value = 'A'
        do {
            Log.d("result : ",value.toString())
        } while (value <= 'Z')
    }
    fun exampleInfinite2(){
        var i = 3
        while (i < 4) {
            Log.d("result : ",i.toString())
            i--
        }
    }

    //for
    fun forLoop() {
        val ranges = 1..5
        for (i in ranges){
            Log.d("result : ","value is $i")
        }
    }

    //forEach
    fun forEach() {
        val ranges = 1..5
        ranges.forEach{
            Log.d("result : ","value is $it")
        }
    }

    //
    fun sameLoop() {
        val ranges = 1..5
        for (i in ranges){
            Log.d("result : ","value is $i")
        }
    }

    // rangeToNumber
    val oneToTen1 = 1.rangeTo(10)

    val oneToTen2 = 1..10

    val oneToTen3 = 1 until 11


    // DownToNumber
    val tenToOne = 10.downTo(1)

    //Break & Continue
    fun BreakContinue() {
        val listNumber = 1.rangeTo(50)
        for (number in listNumber) {
            if (number % 2 == 0) continue
            if (number > 5) break
            Log.d("result : ","$number is odd number")
        }
    }

    //class
    class User(
            val name : String,
            val age : Int
    )


    fun main(){
        val user = User("dea", 19)
        Log.d("result : ", user.toString())
    }
    //data class
    data class UserData(
            val name : String,
            val age : Int
    )


    fun main1(){
        val user = UserData("dea", 20)
        Log.d("result : ", user.toString())
    }

    //setter getter
    data class DataUser(var name : String, var age : Int)


    fun main2(){
        val dataUser = DataUser("arif", 17)
        //set data
        dataUser.name = "faizin"
        dataUser.age = 24
        //get data
        val name = dataUser.name
        val age = dataUser.age


        println("My name is $name, I am $age years old")
    }

    fun main3(){
        val dataUser = DataUser("arif", 17)

        //destructuring declarations
        val (name,age) = dataUser


        println("My name is $name, I am $age years old")
    }

    //collection
    val integerList = listOf(4, 2, 1, 5, 1, 2)

    val integerSet = setOf(4, 2, 1, 5, 1, 2)

    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    //mutable
    fun main4(){
        val anyList = mutableListOf('a', "Kotlin", 3, true, User("dea", 19))

        anyList.add('d') // add item in at last index
        anyList.add(1, "love") // add item at 1st index
        anyList[3] = false // change value item at 3rd index
        anyList.removeAt(1) // remove item at 1st index
    }

    //Collection Operator
    fun main5(){
        val numberList = listOf(1, 2, 3, 4, 5)
        val evenList = numberList.filter { it % 2 == 0 }       // [2, 4]
        val notEvenList = numberList.filterNot { it % 2 == 0 } // [1, 3, 5]
        val multipliedBy5 = numberList.map { it * 5 }  // [5, 10, 15, 20, 25]
        val ascendingSort = numberList.sorted()                 // [1, 2, 3, 4, 5]
        val descendingSort = numberList.sortedDescending()  // [5, 4, 3, 2, 1]
    }

    fun main6(){
        val numberList = listOf(1, 2, 3, 4, 5)
        numberList.count()   // Output: 5
        numberList.sum()   // Output: 15
        numberList.find {it % 2 == 1}   // Output: 1
        numberList.first() // Output: 1
        numberList.last() // Output: 5
        numberList.firstOrNull { it % 2 == 0 } // Output: 2
        numberList.lastOrNull { it % 2 == 3 } // Output: null
    }
    //Sequences
    fun main7() {
        val list = (1..10000).toList()
        list.asSequence()
                .filter { it % 5 == 0 }
                .map { it * 2 }
                .forEach { println(it) }
    }

    //Functional Programming (FP)

    fun getUsernameOld(list: List<DataUser>): List<String>{
        val name = mutableListOf<String>()
        for (user in list){
            name.add(user.name)
        }
        return name
    }
    fun getUsername(list: List<DataUser>): List<String>{
        return list.map {
            it.name
        }
    }
    //
    fun getSum(a:Int,b:Int):Int{
        return a + b
    }
    var c = 3


    fun sum(a:Int,b:Int):Int{
        return a + b + c
    }
    //named
    fun getFullName(first: String, middle: String, last: String): String {
        return "$first $middle $last"
    }

    val fullName = getFullName("Kotlin", " is " , "Awesome")
    val fullName1 = getFullName(middle=" is ", first="Kotlin", last="Awesome")

    fun getFullName1(first: String = "Kotlin", middle: String = " is " , last: String = "Awesome"): String {
        return "$first $middle $last"
    }

    val fullName2 = getFullName1()
    val fullName3 = getFullName1(first="CS Dev")


    fun Int.plusThree(): Int {
        return this + 3
    }

    //Extensions
    fun main8() {
        Log.d("result: ",10.plusThree().toString())
    }
    //output : 13

    val Int.slice: Int
        get() = this.div(2)


    fun main9() {
        Log.d("result: ",10.slice.toString())
    }
    //output : 5

    //Nullable Receiver
    val Int?.slice: Int
        get() = this?.div(2) ?: 0


    fun main10() {
        val value: Int? = null
        Log.d("result: ", value.slice.toString())
    }
    //output : 0

    //Function Type
    //typealias Arithmetic = (Int, Int) -> Int
    //val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    //val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    //lambda
    fun getMessage(name: String): String {
        return "Hello $name"
    }
    val message :(String) -> String = { name: String ->
        "Hello $name"
    }

    val newMessage = message("zahid") //Output: Hello zahid

    //Higher-order Function
    fun main11(){
        printMessage("Dicoding", message2)
    }

    fun printMessage(name: String, message: (String) -> String) {
        Log.d("result: ", message(name))
    }

    val message2 = { name: String ->
        "Hello $name"
    }

    fun main12(){
        printMessage("Dicoding", { name: String ->
            "Hello $name"
        })
    }
    fun main13(){
        printMessage("Dicoding") { name: String ->
            "Hello $name"
        }
    }
    //Function Reference
    fun main14() {
        val numbers = 1.rangeTo(10)
        val evenNumbers = numbers.filter{
            isEvenNumber(it)
        }
        Log.d("result: ", evenNumbers.toString())
    }


    private fun isEvenNumber(number: Int): Boolean {
        return number % 2 == 0
    }

    fun main15() {
        val numbers = 1.rangeTo(10)
        val evenNumbers = numbers.filter(::isEvenNumber)
        Log.d("result: ", evenNumbers.toString())
    }

    //Lambda with Receiver
    fun main16() {
        val message = buildString()
        Log.d("result: ", message)
    }


    private fun buildString(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("Hello ")
        stringBuilder.append("from ")
        stringBuilder.append("lambda")
        return stringBuilder.toString()
    }

    fun main17() {
        val message = buildString {
            append("Hello ")
            append("from ")
            append("lambda")
        }
        Log.d("result: ", message)
    }


    private fun buildString(action:StringBuilder.() ->Unit): String {
        val stringBuilder = StringBuilder()
        stringBuilder.action()
        return stringBuilder.toString()
    }

    //Scope Function With Lambda Receiver (this)
    fun main18(){
        val message = StringBuilder()
        message.append("Hello ")
        message.append("Kotlin!")
        Log.d("result: ", message.toString())
    }

    fun main19(){
        val message = StringBuilder().apply {
            this.append("Hello ")
            this.append("Kotlin!")
        }
        Log.d("result: ", message.toString())
    }

    fun main20(){
        val message = StringBuilder().run {
            append("Hello ")
            append("Kotlin!")
            "New Word"
        }
        Log.d("result: ", message.toString())
    }

    fun main21(){
        val message: String? = "CS Dev"
        val newMessage = message?.run {
            val first = first()
            val last = last()
            "First is $first and last is $last"
        }
        Log.d("result: ", newMessage.toString())

    }

    fun main22(){
        val message: String? = "CS Dev"
        val newMessage = with(message) {
            val first = this?.first()
            val last = this?.last()
            "First is $first and last is $last"
        }
        Log.d("result: ", newMessage)
    }

    //Scope Function With Argument Receiver (it)
    fun main23(){
        val message: String? = "CS Dev"
        val newMessage = message?.let {
            it.toUpperCase()
        }.also {
            println("It length ${it?.length}")
        }
        Log.d("result: ","New message is $newMessage")
        //Output:
        //It length 8
        // New message is CS Dev

    }
    //Lambda and Argument Receiver Comparison
    fun main24(){
        val message: String? = "CS Dev"
        val newMessage = message?.let {
            val first = it.first()
            val last = it.last()
            "First is $first and last is $last"
        }
        Log.d("result: ", newMessage.toString())
    }

    fun main25() {
        val garfield = CatData("Garfield", 2.0)
        val kitty = CatData("Kitty")
    }
}

class CatData(name: String, weight: Double, type: Int){
    var name: String
    var weight: Double
    var type:Int


    init {
        this.name = name
        this.weight = weight
        this.type = type

    }
    constructor(name: String) : this (name, 1.0)
    constructor(name: String, weight: Double) : this (name, 1.0,2)

}


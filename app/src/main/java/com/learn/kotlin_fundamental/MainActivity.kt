package com.learn.kotlin_fundamental

fun main(){
    println("I am ashish , what about you?")
    // Immutable-List example
    val colleagueNames = listOf("Ashish","Sanjay","Amrita")
    println("Immutable list example : $colleagueNames")

    // Mutable-List example

    val mutableList = mutableListOf("Ashish","Sanjay","Amrita")
    mutableList.add("Sameer")
    mutableList.removeAt(0)
    println("Mutable list example : $mutableList")
}


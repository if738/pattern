package com.spd.example

interface People {

    fun getAge(): Short
    fun getName(): String
    fun getGender(): Boolean
    fun accept(visitor: Visitor): String

}
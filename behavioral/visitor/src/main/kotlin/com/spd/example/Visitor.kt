package com.spd.example

interface Visitor {

    fun visitTom(tom: Tom): String
    fun visitJhon(jhon: Jhon): String
    fun visitAnna(anna: Anna): String

}
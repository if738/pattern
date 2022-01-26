package com.spd.example.product

interface TrafficSigns {

    fun isItCriticalViolation(signName: String) : Boolean
    fun getShapeByName(signName: String) : String

}
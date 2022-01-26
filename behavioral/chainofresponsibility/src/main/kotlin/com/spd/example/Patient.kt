package com.spd.example

import com.spd.example.dr.Doctor

class Patient(private val dr: Doctor) {

    fun fixMyProblemInClinic(problem: String): String {
        val diagnose = dr.diagnose(problem)
        if (diagnose == "It Volchanka im sure!") return "VOLCHANKA WHAT??????"
        return "painkiller"
    }

}
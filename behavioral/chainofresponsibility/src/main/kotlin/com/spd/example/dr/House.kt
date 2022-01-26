package com.spd.example.dr

class House : Doctor() {

    override fun diagnose(complaints: String): String {
        if (complaints == "leg hurts") return "It Volchanka im sure!"
        return "Dentist can fix everything"
    }

}
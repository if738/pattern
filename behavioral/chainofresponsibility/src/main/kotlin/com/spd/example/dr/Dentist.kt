package com.spd.example.dr

class Dentist : Doctor() {

    override fun diagnose(complaints: String): String {
        if (complaints == "leg hurts") return diagnoseNext(complaints)
        return "Dentist can fix everything"
    }

}
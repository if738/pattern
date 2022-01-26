package com.spd.example.dr

class Radiologist : Doctor() {

    override fun diagnose(complaints: String): String {
        if (complaints == "leg hurts") return diagnoseNext(complaints)
        return "Radiologist can fix everything"
    }

}
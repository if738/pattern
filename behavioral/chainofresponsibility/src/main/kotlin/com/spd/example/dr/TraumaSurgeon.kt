package com.spd.example.dr

class TraumaSurgeon : Doctor(){

    override fun diagnose(complaints: String): String {
        if (complaints == "leg hurts") return diagnoseNext(complaints)
        return "TraumaSurgeon can fix everything"
    }

}
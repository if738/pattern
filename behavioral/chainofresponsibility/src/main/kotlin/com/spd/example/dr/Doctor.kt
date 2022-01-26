package com.spd.example.dr

abstract class Doctor {

    private var next: Doctor? = null

    fun setNext(next: Doctor): Doctor {
        this.next = next
        return next
    }

    abstract fun diagnose(complaints: String): String

    protected fun diagnoseNext(complaints: String): String {
        if (next == null) {
            return "idk"
        }
        return next!!.diagnose(complaints)
    }

}
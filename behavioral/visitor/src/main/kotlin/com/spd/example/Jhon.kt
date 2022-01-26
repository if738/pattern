package com.spd.example

class Jhon : People {

    private val a :Short = 11
    private val n :String = "Jhon"
    private val g :Boolean = true

    override fun getAge(): Short {
        return a
    }

    override fun getName(): String {
        return n
    }

    override fun getGender(): Boolean {
        return g
    }


    override fun accept(visitor: Visitor) : String {
        return visitor.visitJhon(this)
    }

    override fun toString(): String {
        return "Tom(age=$a, name='$n', gender=$g)"
    }

}
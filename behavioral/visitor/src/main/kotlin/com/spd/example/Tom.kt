package com.spd.example

class Tom : People {

    private val a :Short = 33
    private val n :String = "Tom"
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

    override fun accept(visitor: Visitor): String {
        return visitor.visitTom(this)
    }

    override fun toString(): String {
        return "Tom(age=$a, name='$n', gender=$g)"
    }

}
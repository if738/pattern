package com.spd.example

class Anna : People {

    private val a: Short = 17
    private val n: String = "Anna"
    private val g: Boolean = false

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
        return visitor.visitAnna(this)
    }

    override fun toString(): String {
        return "Tom(age=$a, name='$n', gender=$g)"
    }

}
package com.spd.example

class ParseToStringVisitor: Visitor {

    override fun visitTom(tom: Tom): String {
        return tom.toString()
    }

    override fun visitJhon(jhon: Jhon): String {
        return jhon.toString()
    }

    override fun visitAnna(anna: Anna): String {
        return anna.toString()
    }

}
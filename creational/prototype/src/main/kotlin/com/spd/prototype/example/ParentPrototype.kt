package com.spd.prototype.example

class ParentPrototype : Prototype{

    var data: String = ""

    constructor()
    constructor(target: ParentPrototype){
        this.data = target.data
    }

    override fun cloneJava(): Prototype {
        return ParentPrototype(this)
    }

    fun toStr(): String {
        return "ParentPrototype(data='$data')"
    }

}
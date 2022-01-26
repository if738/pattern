package com.spd.prototype.example.kotlin

data class ChildDataClass(var childField: String = "") : ParentDataClass() {
    override fun toString(): String {
        return "ChildDataClass(childField='$childField', parentField='$parentField')"
    }
}

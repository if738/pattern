package com.spd.prototype.service

import com.spd.prototype.example.ParentPrototype
import com.spd.prototype.example.kotlin.ChildDataClass
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt(){
        //java
        val original = ParentPrototype()
        original.data = "225"
        println(original.toStr())
        println(original)
        val clone = original.cloneJava() as ParentPrototype
        println(clone.toStr())
        println(clone)

        //kotlin
        val originalKotlin = ChildDataClass()
        originalKotlin.childField = "kotlin child field"
        originalKotlin.parentField = "kotlin parent field"
        println(originalKotlin)
        val copiedKotlin = originalKotlin.copy()
        println(copiedKotlin)
    }

}

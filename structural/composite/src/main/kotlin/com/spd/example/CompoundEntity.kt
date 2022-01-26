package com.spd.example

import java.math.BigDecimal

class CompoundEntity : Entity {

    var entities: MutableList<Entity> = ArrayList()

    fun add(child: Entity) {
        entities.add(child)
    }

    fun add(vararg child: Entity) {
        entities.addAll(child)
    }

    fun remove(child: Entity) {
        entities.remove(child)
    }

    fun remove(vararg child: Entity) {
        entities.removeAll(child.toSet())
    }

    override fun price(): BigDecimal {
        return entities.sumOf { it.price() }
    }

    override fun applyTax(multiplier: Double) {
        entities.forEach{ it.applyTax(multiplier)}
    }
}
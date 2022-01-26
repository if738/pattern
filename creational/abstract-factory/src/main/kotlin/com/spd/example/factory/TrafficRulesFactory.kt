package com.spd.example.factory

import com.spd.example.product.BasicRules
import com.spd.example.product.TrafficSigns

interface TrafficRulesFactory {

    fun priorityTrafficSigns(): TrafficSigns
    fun warningTrafficSigns(): TrafficSigns
    fun basicRules(): BasicRules

}
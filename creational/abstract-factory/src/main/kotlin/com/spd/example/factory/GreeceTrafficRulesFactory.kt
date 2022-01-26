package com.spd.example.factory

import com.spd.example.product.BasicRules
import com.spd.example.product.TrafficSigns
import com.spd.example.product.greece.impl.basicrules.GreeceBasicRules
import com.spd.example.product.greece.impl.traffic.GreecePriorityTrafficSigns
import com.spd.example.product.greece.impl.traffic.GreeceWarningTrafficSigns

class GreeceTrafficRulesFactory : TrafficRulesFactory {

    override fun priorityTrafficSigns(): TrafficSigns = GreecePriorityTrafficSigns()
    override fun warningTrafficSigns(): TrafficSigns = GreeceWarningTrafficSigns()
    override fun basicRules(): BasicRules = GreeceBasicRules()

}
package com.spd.example.factory

import com.spd.example.product.BasicRules
import com.spd.example.product.TrafficSigns
import com.spd.example.product.ukraine.impl.basicrules.UkraineBasicRules
import com.spd.example.product.ukraine.impl.traffic.UkrainePriorityTrafficSigns
import com.spd.example.product.ukraine.impl.traffic.UkraineWarningTrafficSigns

class UkraineTrafficRulesFactory : TrafficRulesFactory {

    override fun priorityTrafficSigns(): TrafficSigns = UkrainePriorityTrafficSigns()
    override fun warningTrafficSigns(): TrafficSigns = UkraineWarningTrafficSigns()
    override fun basicRules(): BasicRules = UkraineBasicRules()

}
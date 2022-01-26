package com.spd.service

import com.spd.example.ItemsDeliveryService
import com.spd.example.SubJhon
import com.spd.example.SubTom
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {
        val subJhon = SubJhon()
        val itemsDeliveryService = ItemsDeliveryService()
        itemsDeliveryService.subscribe(subJhon)
        itemsDeliveryService.subscribe(SubTom())
        itemsDeliveryService.notifySubscribers()
        println()
        itemsDeliveryService.unsubscribe(subJhon)
        itemsDeliveryService.notifySubscribers()
    }

}

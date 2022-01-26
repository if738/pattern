package com.spd.singleton.service

import com.spd.singleton.example.KotlinSingleton
import com.spd.singleton.example.SingletonEager
import com.spd.singleton.example.SingletonLazy
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    private val ses: KotlinSingleton = KotlinSingleton

    private var se: SingletonEager.Companion = SingletonEager
    private val sl: SingletonLazy.Companion = SingletonLazy

    @PostConstruct
    fun runIt(){
        ses.inc()
        ses.showMessage()
        val kotlinSingleton = KotlinSingleton
        kotlinSingleton.inc()
        kotlinSingleton.showMessage()
    }

}

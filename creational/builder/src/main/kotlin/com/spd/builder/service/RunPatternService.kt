package com.spd.builder.service

import com.spd.builder.components.required.CPU
import com.spd.builder.components.required.PSU
import com.spd.builder.components.required.RAM
import com.spd.builder.entities.classicbuilder.bulder.PcSpecBuilder
import com.spd.builder.entities.kotlinBuilder.PCSpecK
import com.spd.builder.entities.kotlinJavaStyleBuilder.PCSpecJ
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt(){

        val pcB = PcSpecBuilder()
        pcB.setRam(RAM())
        pcB.setPsu(PSU())
        pcB.setCpu(CPU())
        val pcSpecC = pcB.build()

        // kotlin style builder
        val pcSpecK = PCSpecK.Builder()
            .ram(RAM())
            .psu(PSU())
            .cpu(CPU())
            .build()

        // java style builder
        val pcSpecJ = PCSpecJ.Builder()
            .ram(RAM())
            .psu(PSU())
            .cpu(CPU())
            .build()

        println(pcSpecK.spec())
        println(pcSpecJ.spec())
        println(pcSpecC.spec())



    }

}
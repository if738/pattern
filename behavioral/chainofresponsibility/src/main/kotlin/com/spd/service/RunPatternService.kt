package com.spd.service

import com.spd.example.Patient
import com.spd.example.dr.Dentist
import com.spd.example.dr.House
import com.spd.example.dr.Radiologist
import com.spd.example.dr.TraumaSurgeon
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {
        val traumaSurgeon = TraumaSurgeon()
        traumaSurgeon.setNext(Radiologist())
            .setNext(TraumaSurgeon())
            .setNext(Dentist())
            .setNext(House())

        val patient = Patient(traumaSurgeon)
        println(patient.fixMyProblemInClinic("leg hurts"))
    }

}

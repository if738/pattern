package com.spd.prototype.service

import com.spd.prototype.wrapper.SaveBaseTemplate
import com.spd.prototype.wrapper.extended.CompressTemplate
import com.spd.prototype.wrapper.extended.EncodedTemplate
import com.spd.prototype.wrapper.extended.SaveExtendedTemplate
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt(){
        val saveExtendedTemplate = EncodedTemplate(CompressTemplate(SaveExtendedTemplate(SaveBaseTemplate())))
        saveExtendedTemplate.save("<xml>MOCK</xml>")
        println(saveExtendedTemplate.read())
    }

}

package com.spd.service

import com.spd.example.GenerateDefaultInvoice
import com.spd.example.GenerateExtendedXmlInvoice
import com.spd.example.GenerateMySQLInvoice
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val generateDefaultInvoice = GenerateDefaultInvoice()
        println(generateDefaultInvoice.invoiceFormat())
        println(generateDefaultInvoice.generateInvoice())
        println(generateDefaultInvoice.getData())
        println()
        val generateExtendedXmlInvoice = GenerateExtendedXmlInvoice()
        println(generateExtendedXmlInvoice.invoiceFormat())
        println(generateExtendedXmlInvoice.generateInvoice())
        println(generateExtendedXmlInvoice.getData())
        println()
        val generateMySQLInvoice = GenerateMySQLInvoice()
        println(generateMySQLInvoice.invoiceFormat())
        println(generateMySQLInvoice.generateInvoice())
        println(generateMySQLInvoice.getData())


    }

}
